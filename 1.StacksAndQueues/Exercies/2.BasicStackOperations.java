import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //N-num of elements
        //s-koito trqbwa da mahnem ot steka (pop)
        //x-dali e v steka
        String []firstLine=scanner.nextLine().split("\\s+");
        int n=Integer.parseInt(firstLine[0]);
        int s=Integer.parseInt(firstLine[1]);
        int x=Integer.parseInt(firstLine[2]);

        String[] numbers=scanner.nextLine().split("\\s+");
        ArrayDeque<Integer>stackNumbers=new ArrayDeque<>();
        for (int i = 0; i <n ; i++) {
            stackNumbers.push(Integer.parseInt(numbers[i]));
        }
        for (int j=0;j<s;j++){
            stackNumbers.poll();
        }
        if(!stackNumbers.isEmpty()) {
            if (stackNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(stackNumbers.pop());
            }
        }else {
            System.out.println("0");
        }
    }
}
