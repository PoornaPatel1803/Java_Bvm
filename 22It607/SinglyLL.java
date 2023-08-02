import java.util.*;
public class SinglyLL {
    public class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;
    public void new_node(int data){
        Node nd=new Node(data);
        if(head==null){
            head=tail=nd;
        }
        else{
            tail.next=nd;
            tail=nd;
        }
    }
    public void display(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        public void Search(int find){
            Node cur=head;
            int count=0,flag=1;
            while (cur!=null)  
            {  count++;
                cur=cur.next;
            if(cur == null)  
            { 
                //System.out.println("item found at location "+(count+1));  
                flag=0; 
                break; 
            }    
        }
        if(flag==0){
            System.out.println("the data not found");
        }  
        else{
            System.out.println("the "+find+" found at : "+(count+1));
        }
        }
     
    public static void main(String[] args) {
        int data;
        System.out.print("Enter the size of LinkeList:");
        Scanner sc=new Scanner(System.in);
        data=sc.nextInt();
        int ele[]=new int[data];
        SinglyLL obj[]=new SinglyLL[data];
        for(int i=0;i<data;i++){
            obj[i]=new SinglyLL();
            System.out.print("\nEnter "+i+" value:");
            ele[i]=sc.nextInt();
            obj[i].new_node(ele[i]);
        }
        System.out.print("final LinkedList is:");
        for(int i=0;i<data;i++){
            obj[i].display();
        }
//search operation
        System.out.println("Enter the element to find:");
        int find=sc.nextInt();
        for(int i=0;i<data;i++){
            obj[i].Search(find);
        }
    }
}
