import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //2 + 5 + 10 - 2 - 1
        String inputLine=scanner.nextLine();
        String[] input=inputLine.split("\\s+");
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for (int i = 0; i <input.length ; i++) {
            if(input[i].equals("+")){
                int num=Integer.parseInt(input[i+1]);

                stack.push(num+stack.pop());
                i++;
            }else if(input[i].equals("-")){
                int num=Integer.parseInt(input[i+1]);
                stack.push(stack.pop()-num);
                i++;
            }
            else{
                stack.push(Integer.parseInt(input[i]));
            }
        }
        System.out.println(stack.peek());

    }
}