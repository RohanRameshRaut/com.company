
import java.util.Scanner;

public class CWH_07_Ch1_PS {
    public static void main(String[] args) {
        // Question 1
        int a = 4;
        int b = 17;
        int c = 6;
        int sum = a + b + c;
        System.out.println(sum);

        // Question 2
        float sub1 = 45;
        float sub2 = 95;
        float sub3 = 48;
        float cgpa = (sub1+sub2+sub3)/30;
        System.out.println(cgpa);

        // Question 3
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        // Question 4 kilometers to miles
        System.out.println("Enter the kilometers");
        double k = sc.nextFloat();
        double m = k*0.6213;
        System.out.println("Mile conversion: "+ m);

        // Question 5
        System.out.println("Enter your number: ");
        System.out.println(sc.hasNextInt());

    }
}
