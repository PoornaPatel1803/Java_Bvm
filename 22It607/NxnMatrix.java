import java.util.*;

public class NxnMatrix {
    public static void main(String[] args) {
        System.out.println("::Data for A matrix::");
        System.out.println("Enter rows of a matrix:");
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        System.out.println("Enter columns of matrix:");
        int col1 = sc.nextInt();
        System.out.println("::Data for B matrix::");
        System.out.println("Enter rows of a matrix:");
        int row2 = sc.nextInt();
        System.out.println("Enter columns of matrix:");
        int col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }
        int a[][] = new int[row1][col1];
        int b[][] = new int[row2][col2];
        int c[][] = new int[row1][col2];
        System.out.println("Enter value for 1st matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter value for 1st matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
