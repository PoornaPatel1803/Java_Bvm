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
public class Studentaobj {

    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("One by one:"); 
        Marks obj[]=new Marks[5];
        for(int i=0;i<3;i++)
        {
            obj[i]=new Marks(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            obj[i].getdata();
        }
    }
}
