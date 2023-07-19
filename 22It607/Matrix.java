import java.util.*;

public class Matrix {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter your choice:");
        int operations=obj.nextInt();

        System.out.println("\nEnter rows of matrix");
        int row=obj.nextInt();
        System.out.println("\nEnter columns of matrix");
        int column=obj.nextInt();
        int arr[][]=new int[row][column];
        System.out.println("Enter data:");

        for(int i=0;i<=row;i++){
            for(int j=0;j<=column;i++){
                arr[i][j]=obj.nextInt();
            }
        }

        for (int i=0;i<=row;i++){
            for(int j=0;j<=column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
