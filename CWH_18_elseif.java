
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
//
//        if (age>56)
//        {
//            System.out.println("You are experienced!");
//        }
//        else if (age>46)
//        {
//            System.out.println("You are semi-experienced!");
//        }
//        else if (age>36)
//        {
//            System.out.println("You are semi-semi-experienced!");
//        }
//        else
//        {
//            System.out.println("You are not experienced!");
//        }

        switch (age){
            case 18:
                System.out.println("you are 18!");
                break;
            case 24:
                System.out.println("your are 24!");
                break;
            case 45:
                System.out.println("You are 45!");
                break;
            default:
                System.out.println("Enter correct age!");
        }
    }
}
