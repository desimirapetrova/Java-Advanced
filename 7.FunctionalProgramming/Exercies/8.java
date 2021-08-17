import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        //а и б четни
        //а четно б нечетно
        //а нечетно б четно
        //а нечетно б нечетно
        Comparator<Integer>comparator=((a,b)->{
            if(a%2==0&&b%2==0){
                return a.compareTo(b);
            }else if(a%2==0&&b%2!=0){
                return -1;
            }else if (a%2!=0&&b%2==0){
                return 1;
            }
            return a.compareTo(b);
        });

        numbers.stream().sorted(comparator).forEach(e-> System.out.print(e+" "));
    }
}
