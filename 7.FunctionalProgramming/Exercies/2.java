import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Function<приема,връща>
        //Consumer<приема>
        //Supplier<връща>
        //Predicate<приема>->return boolean
        //BiFunction<приема1,приема2,връща>

        //приема лист->принтира->Consumer

        String []names=scanner.nextLine().split("\\s+");
        Consumer<String[]>printer=namesArr-> {
            for (int i = 0; i < namesArr.length; i++) {

                System.out.println("Sir "+namesArr[i]);
            }
        };

        printer.accept(names);


    }
}
