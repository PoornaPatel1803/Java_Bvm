import java.util.*;
class Values
{
    void conditions()
    {
    System.out.println("Enetr the year to check:");
    Scanner obj=new Scanner(System.in);
    int year=obj.nextInt();
    if(year%100==0)
    {
        if(year%400==0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
    }
    else
    {
        if(year%4==0){
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is a non leap year");
        }
    }
    }
}
public class Leap_year
{
    public static void main(String[] args)
    {
        Values obj=new Values();
        obj.conditions();
    }
}