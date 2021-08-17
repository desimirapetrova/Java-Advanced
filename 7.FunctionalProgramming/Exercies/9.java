import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        //приена лист и число->връща true /false
        BiFunction<List<Integer>,Integer,Boolean>predicate=((list,number)-> {
            //  boolean isValid=true;
            for (Integer numInList:list){
                if(number%numInList!=0){
                    return false;
                }
            }
            return true;
        });
        for (int number = 1; number <=n ; number++) {
            //проверка дали се дели на всички елементи в листа
            if(predicate.apply(numbers,number)){
                System.out.print(number+" ");
            }
        }
    }
}
