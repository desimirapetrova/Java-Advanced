import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashMap<String,String> emails=new LinkedHashMap<>();
        while (true){
            String name=scanner.nextLine();
            if (name.equals("stop")){
                break;
            }
            String email=scanner.nextLine();
            if(email.contains("bg")){
                emails.put(name,email);
            }else {
                continue;
            }
        }
        for (Map.Entry<String,String>entry:
                emails.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(),entry.getValue());
        }
    }
}