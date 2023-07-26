import java.util.*;

class Stack_op{
    int top=-1,max;
    int data,choice;
    int stack[] = new int[20];
    int count=0;
    void S_data(){
        Scanner sc=new Scanner(System.in);
        
        if(count==0){
        System.out.print("Enter size of stack");
        max=sc.nextInt();
        count++;
        }
    
        System.out.print("1)to enter the data\n2)to delete data\n3)to display stack:\n4)to exit");
        choice=sc.nextInt();
    }
    public int S_Operations(){
        Scanner sc=new Scanner(System.in);
        switch (choice) {
            case 1:if(top!=max)
                    {
                        System.out.println("Enter your data:");
                        data =sc.nextInt();
                        //top++;
                        stack[++top]=data;
                        System.out.println("Element added");
                    }
                    else{
                        System.out.println("stack reached upper limit");
                        return 0;
                    }
                S_data();
                break;
            
        case 2:if(top>=0)
                {
                    top--;
                    System.out.println("element deleted");
                }
                else{
                    System.out.println("Stack underflow");
                }
                S_data();
                break;
        case 3:for(int i=0;i<=max;i++)
                {
                    System.out.println(stack[i]);
                }
                S_data();
                break;


        default:System.out.println("Program Completed");
            return 0;
        }
        return 0;
    }
}
public class Stack_Queue {
    public static void main(String[] args) {
        //stack=LIFO Queue=FIFO
        Stack_op obj=new Stack_op();
        obj.S_data();
        obj.S_Operations();
        
    }
}
