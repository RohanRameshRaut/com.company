
import java.util.Scanner;

public class CWH_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the user.");
        Scanner sc = new Scanner(System.in); // Scanner is a class and sc is an object of that class.
//        System.out.println("Enter number 1: ");
////        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2: ");
////        int b = sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of these numbers is: ");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next(); // --> .next() method only reads the word by word string and ignores the spaces
        String str = sc.nextLine(); // to avoid the above problem we use .nextLine() method
        System.out.println(str);


    }
}
