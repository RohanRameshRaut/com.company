
import java.util.Scanner;

public class CWH_06_CBSC_Extercise {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of 5 subjects.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of Marathi: ");
        float marathi = sc.nextFloat();
        System.out.println("Enter Marks of Hindi: ");
        float hindi = sc.nextFloat();
        System.out.println("Enter Marks of English: ");
        float english = sc.nextFloat();
        System.out.println("Enter Marks of Math: ");
        float math = sc.nextFloat();
        System.out.println("Enter Marks of Science: ");
        float science = sc.nextFloat();

        float total = marathi + hindi + english + math + science;
        System.out.println("Percentage: ");
        System.out.println((total/500)*100);

    }
}
