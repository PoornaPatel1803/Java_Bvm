import java.util.*;
class calc{
	public static void main(String args[]){
		int c;
		Scanner obj=new Scanner(System.in);
		System.out.println("1.addition\n2.Subtraction\n3.Division\n4.Multiplication\nEnter your choice:");
		int choice=obj.nextInt();
		System.out.println("\nEnter 1st number:");
		int a=obj.nextInt();
		System.out.println("\nEnter 2nd number:");
		int b=obj.nextInt();
		switch(choice){
		case 1:c=a+b;
			System.out.println("Result is:"+c);
			break;
		case 2:c=a-b;
			System.out.println("Result is:"+c);
			break;
		case 3:c=a/b;
			System.out.println("Result is:"+c);
			break;
		case 4:c=a*b;
			System.out.println("Result is:"+c);
			break;
		}
	}
}