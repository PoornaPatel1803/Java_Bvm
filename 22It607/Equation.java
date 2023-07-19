import java.util.*;
import java.lang.*;
public class Equation {
    public static void main(String args[]){
        double fact,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x:");
       int x=sc.nextInt();
        System.out.println("enter the range:");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            fact=i;
            result-=Math.pow(x,i)/fact;
        }
        System.out.println(result);
    }
}
