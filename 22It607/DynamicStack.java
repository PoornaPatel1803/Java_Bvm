import java.util.Scanner;

class Stack
{
    int top;
    int n = 2;
    int[] stack = new int[n];
    Stack()
    {
        top =-1;
    }

    void push(int val)
    {
        if(stack.length==top+1)
        {
            int[] temp = new int[n*2];
            this.n = n*2;
            for(int i=0; i<(n/2); i++)
            {
                temp[i] = stack[i];
            }
            stack = temp;
            stack[++top] = val;
        }else{
            stack[++top] = val;
        }
    }

    void pop()
    {
        try{
            if(top==-1)
            {
                System.out.println("UnderFlow");
            }else{
                stack[top]=0;
                top--;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("UnderFlow");
        }
        
    }
    
    void display()
    {
       for(int i=0; i<stack.length; i++)
       {
        System.out.print(stack[i]+" ");
       }
    }
}

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack s = new Stack();
    int choice = 0;
    while(choice != 4)
    {
        System.out.print("\n1) PUSH");
        System.out.print("\n2) POP");
        System.out.print("\n3) PEEP");
        System.out.print("\nEnter Your Choice : ");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                    System.out.print("\nEnter a Data : ");
                    int data = sc.nextInt();
                    s.push(data);
                    break;
            case 2:
                    s.pop();
                    break;
            case 3:
                    s.display();
                    break;

       }
}
}
}