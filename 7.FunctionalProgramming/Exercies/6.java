import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int maxLength=Integer.parseInt(scanner.nextLine());
        String[]names=scanner.nextLine().split("\\s+");
        //взимам име и да връщам дали дължината е <= на maxLength
        Predicate<String>isValidLength=name->name.length()<=maxLength;
        Arrays.stream(names).filter(isValidLength).forEach(System.out::println);
    }
}
