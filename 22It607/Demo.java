import java.util.*;
class Demo{
	public static void main(String args[]){
		int a,b,c;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number:");
		a=obj.nextInt();
		System.out.println("\nEnter second number:");
		b=obj.nextInt();
		c=a+b;
		System.out.println("\nResult: "+c);
	}
}