
import java.util.Scanner;

public class CWH_13_Ch3_String {
    public static void main(String[] args) {
//        String name = new String("Harry");
//        or
//        String name = "Rohan";
//        System.out.println(name);

//        Different ways to print the data in java.
//        System.out.print("The name is : "); // no new line or space
//        System.out.println("Rohan"); // move the cursor to the new line

//        you can use C language also
//        int a = 10;
//        float b = 4.5f;
////        System.out.printf("The value of a is %d and the value of b is %f ", a, b);
//        System.out.format("The value of a is %d and the value of b is %f ", a, b); // work similar to the printf.

//        Taking input from the user as string
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);





    }
}
