import java.util.*;

class SpiInvalid extends Exception {
    public SpiInvalid(String s) {
        System.out.println(s);
    }
}

public class CustomExeption {

    static String name, gender, department;
    static int age;
    static double spi;

    public static void studata(double cspi, String cdept) throws SpiInvalid {
        if (cspi <= 5.5 || cspi >= 4.7 || cdept == "IT") {
            throw new SpiInvalid("Custom exception encountered");
        } else {
            System.out.println("Done scene");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter name:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Enter Gender:");
        gender = sc.nextLine();
        System.out.println("Enter Dept:");
        department = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter Spi:");
        spi = sc.nextDouble();
        try {
            studata(spi, department);
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
    }
}
