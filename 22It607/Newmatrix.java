/*Java Program to add two matrix*/
import java.util.Scanner;
public class Newmatrix
{
    public static void main(String[] args) 
    {
        int p, q, m, n;    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter your choice:");
        int operations=sc.nextInt();
        System.out.print("Enter the number of rows in the first matrix:");
        p = sc.nextInt();   
        System.out.print("Enter the number of columns in the first matrix:");
        q = sc.nextInt();  
        System.out.print("Enter the number of rows in the second matrix:");
        m = sc.nextInt();   
        System.out.print("Enter the number of columns in the second matrix:");
        n = sc.nextInt();   
        if (p == m && q == n) 
        {
            int a[][] = new int[p][q];    
            int b[][] = new int[m][n];    
            int c[][] = new int[m][n];    
          
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
           
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("");
        
            System.out.println("First Matrix:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
      
            System.out.println("Second Matrix:");
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            if(operations==1){
            //Loop to add matrix elements
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        for (int k = 0; k < q; k++) 
                        {
                            c[i][j] = a[i][j] + b[i][j];
                        }
                    }
                }
            }
            else if(operations==2){
            //Loop to sub matrix elements
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        for (int k = 0; k < q; k++) 
                        {
                            c[i][j] = a[i][j] - b[i][j];
                        }
                    }
                }
            }
            else if(operations==3){
            //Loop to sub matrix elements
                for (int i = 0; i < p; i++) 
                {
                    for (int j = 0; j < n; j++) 
                    {
                        for (int k = 0; k < q; k++) 
                        {
                            c[i][j] = a[i][j] * b[i][j];
                        }
                    }
                }
            }
            //Print the matrix
            System.out.println("Matrix after addition:");
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition not possible");
            System.out.println("Try Again");
        }
    }
}