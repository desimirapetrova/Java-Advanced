import java.util.Scanner;

public class ReverseMAtrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int rows=scanner.nextInt();
        int cols=scanner.nextInt();

        int[][]matrix=new int[rows][cols];
        fillMatrix(scanner,matrix,rows,cols);

//        for (int row = rows-1; row >=0 ; row--) {
//            for (int col = cols-1; col >=0 ; col--) {
//                //String temp=matrix[row][col];
//              //  System.out.print(matrix[row][col]+" ");
//                //int num=matrix[row][col];
//            if(col==row){
//                System.out.print(matrix[row-1][col+1]+" ");
//            }else if(col==(rows-row-1)){
//                    System.out.print(matrix[row][col]+" ");
//                }
//                System.out.println();
//            }
//           System.out.println();
//        }
        int row=rows-1;
        int col=cols-1;
        while (row!=-1){
            int r=row;
            int c=col;
            while (c<cols&&r>=0){
                System.out.print(matrix[r--][c++]+" ");
            }
            System.out.println();
            col--;
            if(col==-1){
                col=0;
                row--;
            }
        }

    }
    public static void fillMatrix(Scanner scanner,int[][]matrix,int rows,int cols){
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
}
