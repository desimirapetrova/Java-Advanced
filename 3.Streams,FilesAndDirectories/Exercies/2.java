import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        scanner.nextLine();

        LinkedHashSet<Integer>firstSet=new LinkedHashSet<>(n);
        LinkedHashSet<Integer>secondSet=new LinkedHashSet<>(m);

        for (int i = 0; i <n ; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < m; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        //LinkedHashSet<Integer>repeatElements=new LinkedHashSet<>();
        firstSet.retainAll(secondSet);
        firstSet.forEach(number-> System.out.print(number+" "));
    }
}
