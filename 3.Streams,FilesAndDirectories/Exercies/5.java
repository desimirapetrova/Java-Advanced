import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashMap<String,String>phonebook=new LinkedHashMap<>();


        while (true){
            String input=scanner.nextLine();
            if(input.equals("search")){
                String searchName=scanner.nextLine();
                while (!searchName.equals("stop")){
                    if(!phonebook.containsKey(searchName)){
                        System.out.println("Contact "+searchName+" does not exist.");
                    }else {
                        System.out.println(searchName+" -> "+phonebook.get(searchName));
                    }
                    searchName=scanner.nextLine();
                }
                break;
            }else {
                String name=input.split("-")[0];
                String number=input.split("-")[1];
                phonebook.put(name,number);
            }
        }
    }
}
