import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<String> printQueue=new ArrayDeque<>();
        String task= scanner.nextLine();
        while(!task.equals("print")){
            if(task.equals("cancel")){
                if(printQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    System.out.println("Canceled "+printQueue.poll());
                }
            }else{
                printQueue.offer(task);
            }
            task= scanner.nextLine();
        }
        while(!printQueue.isEmpty()){
            System.out.println(printQueue.poll());
        }

    }
}