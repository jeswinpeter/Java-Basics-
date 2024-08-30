//This code checks if a matrix is Symmetric or not
import java.util.Scanner;

public class SymmetryTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter order of the matrix[m X n] -> ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] A = new int[m][n];
        int[][] transpose = new int[n][m];  //Transpose of A[][]

        int flag = 0;
        if(m == n) {        //Only Square Matrix can be Symmetric
            System.out.println("Enter the matrix -> ");
            //Loop to construct matrix and its transpose
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = scan.nextInt();
                    transpose[j][i] = A[i][j];
                }
            }
            scan.close();

            //Loop to check if the matrix is Symmetric
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] != transpose[i][j]) {
                        flag = 1;   //Indicates that the matrix is not symmetric
                        break;
                    }
                }
            }
        }

        //Result
        if(m != n || flag == 1)
            System.out.println("The matrix is not Symmetric!!!");
        else
            System.out.println("---The matrix is Symmetric---");

    }
}