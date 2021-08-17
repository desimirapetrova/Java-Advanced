import java.util.ArrayDeque;
import java.util.Scanner;

public class Browser_History {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String> deque=new ArrayDeque<>();
        String command=scanner.nextLine();
        String current="";
        while (!command.equals("Home")){
            if(command.equals("back")){
                if(deque.isEmpty()){
                    System.out.println("no previous URLs");
                    command=scanner.nextLine();
                    continue;
                }else {
                    current=deque.pop();
                    //   System.out.println(deque.peek());
                }
            }else {
                if(!current.isEmpty()){
                    deque.push(current);
                }
                current=command;
//                deque.push(command);
//                System.out.println(deque.peek());
            }
            System.out.println(current);
            command=scanner.nextLine();
        }
    }
}