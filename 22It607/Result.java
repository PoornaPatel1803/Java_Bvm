import java.util.*;
class Result{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your result:");
		System.out.println("Enter physics marks:");
		int phy=obj.nextInt();
		System.out.println("Enter chemistry marks:");
		int che=obj.nextInt();
		System.out.println("Enter biology marks:");
		int bio=obj.nextInt();
		int avg=(phy+che+bio)/3;
		if(avg>80 && avg<100){
			System.out.println("Distinction");
		}
		else if(avg>65 && avg<80){
			System.out.println("First class");
		}
		else if(avg>45 && avg<65){
			System.out.println("Second class");
		}
		else if(avg>33 && avg<45){
			System.out.println("Third class");
		}
		else{
			System.out.println("fail");
		}
	}
}