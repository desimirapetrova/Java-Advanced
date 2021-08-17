import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[]input=scanner.nextLine().split(", ");

        int size=Integer.parseInt(input[0]);
        String pattern=(input[1]);
        int[][]matrix=new int[size][size];

        int startIndex=1;
        if(pattern.equals("A")) {
            for (int col = 0; col < size; col++) {
                for (int row = 0;row <size ; row++) {
                    matrix[row][col]=startIndex++;
                }
            }
        }else if(pattern.equals("B")){
            for (int col = 0; col <size ; col++) {
                if(col%2==0) {
                    for (int row = 0; row < size; row++) {
                        matrix[row][col]=startIndex++;
                    }
                }else {
                    for (int row = size-1; row >=0 ; row--) {
                        matrix[row][col]=startIndex++;
                    }
                }
            }
        }
        for (int row = 0; row <size ; row++) {
            for (int col = 0; col <size ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void fillMatrix(Scanner scanner,int[][]matrix,int rows,int cols){
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
    public static void fillMatrix2(Scanner scanner,int[][]matrix,int rows,int cols){
        for (int row = 0; row <rows ; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
