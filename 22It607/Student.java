import java.util.*;
class Marks
{   String name;
    int maths,science,history,goegraphy,psychology,Avg,total,perc;
    Marks(String nm,int mat,int sci,int his,int geo,int psy)
    {
        Avg=(mat+sci+his+geo+psy)/5;
        total=mat+sci+his+geo+psy;
        perc=(total*100/500);
        name=nm;
        maths=mat;
        science=sci;
        history=his;
        goegraphy=geo;
        psychology=psy;
    }
    void getdata()
    {
        System.out.println("\nName:: "+name);
        System.out.println("\n**Marks**");
        System.out.println("Maths        :: "+maths);
        System.out.println("Science      :: "+science);
        System.out.println("History      :: "+history);
        System.out.println("Geogrphy     :: "+goegraphy);
        System.out.println("Psychology   :: "+psychology);
        System.out.println("Average marks::"+Avg);
        System.out.println("Percentage::"+perc+"%");
    }
}
public class Student
{
        public static void main(String[] args) {
            String name;
            Scanner sc=new Scanner(System.in);
            int maths, science, history, goegraphy, psychology;
            System.out.print("Enter your name: ");
            name=sc.nextLine();
            System.out.print("Enter marks of Maths: ");
            maths=sc.nextInt();
            System.out.print("Enter marks of science: ");
            science=sc.nextInt();
            System.out.print("Enter marks of history: ");
            history=sc.nextInt();
            System.out.print("Enter marks of geography: ");
            goegraphy=sc.nextInt();
            System.out.print("Enter marks of psychology: ");
            psychology=sc.nextInt();
            Marks obj=new Marks(name, maths, science, history, goegraphy, psychology);
            obj.getdata();
        }
}
