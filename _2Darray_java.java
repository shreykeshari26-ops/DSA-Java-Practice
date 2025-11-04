import java.util.*;
public class _2Darray_java {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//        int matrix[][] = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//            //output
//            for (i = 0; i < rows; i++){
//                for (int j = 0; j < cols; j++) {
//                    System.out.println(matrix[i][j]);
//                }
//            }
//            System.out.println(" ");
//        }
//    }

    //For a given matrix of N x M, print its transpose.
    public static void main(String[] args) {
        System.out.println("Enter matrix order n and m");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int row[][]= new int[n][m];
         for(int i=0; i<n;i++){
             for (int j=0;j<m;j++){
                 row[i][j]=sc.nextInt();

             }

         }
        System.out.println("Matrix elements are:");
        for(int i=0; i<n;i++) {// i<=n will be wrong as it matrix will exceed and in array indices start from 0
            for (int j = 0; j < m; j++) {
                System.out.print(row[i][j] +" ");
            }
            System.out.println(" ");
        }

        System.out.println(" Transpose Matrix elements are:");
        for(int j=0; j<n;j++) {// i<=n will be wrong as it matrix will exceed and in array indices start from 0
            for (int i = 0; i < m; i++) {
                System.out.print(row[i][j] +" ");
            }
            System.out.println(" ");
        }
        sc.close();

    }

}
