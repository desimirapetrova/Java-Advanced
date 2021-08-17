import java.util.*;
import java.util.stream.Collectors;

public class CountRealNUmbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<Double, Integer> number = new LinkedHashMap<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .forEach(n -> {
                    number.putIfAbsent(n,0);
                    number.put(n,number.get(n)+1);
                });

        String output=number.entrySet()
                .stream()
                .map(entry -> String.format("%.1f -> %d",entry.getKey(),entry.getValue()))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);

    }
}
