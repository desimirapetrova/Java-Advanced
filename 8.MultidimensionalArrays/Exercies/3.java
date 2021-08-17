import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int size=Integer.parseInt(scanner.nextLine());
        int [][]matrix=new int[size][size];

        fillMatrix2(scanner,matrix,size,size);

        int sumD1=0;
        int sumD2=0;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int number=matrix[row][col];
                if(row==col){
                    sumD1+=number;
                }
                if(col==(size-row-1)){
                    sumD2+=number;
                }

            }
        }
        System.out.println(Math.abs(sumD1-sumD2));

    }
    public static void fillMatrix(Scanner scanner,int[][]matrix,int rows,int cols){
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
    private static void printMatrix(String[][]matrix){
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col <matrix[row].length ; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void fillMatrix2(Scanner scanner,int[][]matrix,int rows,int cols){
        for (int row = 0; row <rows ; row++) {
            matrix[row]= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
    }
}
