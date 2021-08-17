import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String line=scanner.nextLine();

        Map<String,Map<String,Double>>costs=new TreeMap<>();

        while (!line.equalsIgnoreCase("Revision")){
            String[]tokens=line.split(", ");

            String shop=tokens[0];
            String product=tokens[1];
            double price=Double.parseDouble(tokens[2]);

            costs.putIfAbsent(shop,new LinkedHashMap<>());
            costs.get(shop).put(product,price);

            line=scanner.nextLine();
        }
        costs.entrySet()
                .stream()
                .forEach(entry->{
                    System.out.println(entry.getKey()+"->");
                    entry.getValue().entrySet()
                            .stream()
                            .forEach(innnerEntry->{
                                System.out.printf("Product: %s, Price: %.1f%n",
                                        innnerEntry.getKey(),innnerEntry.getValue());
                            });
                });
    }
}
