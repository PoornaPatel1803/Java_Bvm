import java.util.*;
class pattern{
	public static void main(String args[]){
		float c,f;
		System.out.println("1.celcius to ferenheit\n2.Fereheit to celcius\nEnter your choice::");
		Scanner obj=new Scanner(System.in);
		int choice=obj.nextInt();
		if(choice==1){
			System.out.println("Enter the temprature:");
			c=obj.nextDouble();
			f=(c*9/5)+32;
			System.out.println(f);
		}
		else{
			System.out.println("Enter the temprature:");
			f=obj.nextDouble();
			c=(f-32)*5/9;
			System.out.println(c);
		}

	}
}