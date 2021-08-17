import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBracket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
        //(2 + 3)
        //(3 + 1)
        //(2 - (2 + 3) * 4 / (3 + 1))
        String input= scanner.nextLine();
        ArrayDeque<Integer>indexes=new ArrayDeque<>();
        ArrayDeque<Integer>indexClose=new ArrayDeque<>();
        for (int i = 0; i <input.length() ; i++) {
            char c=input.charAt(i);
            if(c=='('){
                indexes.push(i);
            }else if(c==')'){
                System.out.println(input.substring(indexes.pop(),i+1));
            }
        }
    }
}