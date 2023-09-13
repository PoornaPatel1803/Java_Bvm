import java.util.*;

class MyThread implements Runnable {
	Thread t1;
	int from, to;

	MyThread(int from, int to) {
		this.from = from;
		this.to = to;
				t1 = new Thread (this,"pos-neg");

		
		t1.start();
	}

	public void run() {
		try {
				for (int i=from;i<=to;i++){
				if(i<0){
					System.out.println(t1+": Nagative");
				}
				else{
					System.out.println(t1+":Positive");
				}
				t1.sleep(800);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Exception Occured : " + e);
		}
	}
}

class MultipleThread2 {
	public static void main(String[] args) {
		System.out.println(".....Multiple Thread for Positive/nagative .....\n\n");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range for find (even and odd)&(pos and nag) : ");
		System.out.print("From : ");
		int from = sc.nextInt();
		System.out.print("To : ");
		int to = sc.nextInt();

		MyThread obj = new MyThread(from, to);
		Thread t1 = Thread.currentThread();
		t1.setName("even odd");

		try {
				for(int i=from;i<=to;i++){
					if(i%2==0){
						System.out.println("Even");
					}
					else{
						System.out.println("Odd");
					}
				}
				t1.sleep(500);
			} catch(InterruptedException e) {
				System.out.println("Exception Occured : " + e);
		}
	}
}