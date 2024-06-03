
import java.util.Scanner;

public class CWH_19_Ch4_practiceSet {
    public static void main(String[] args) {

        // Question 1
        // answer will be error
//        int a = 10;
//        if(a=11)
//        {
//            System.out.println("I am 11");
//        }

        // Question 2
//        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in m1: ");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in m2: ");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in m3: ");
//        m3 = sc.nextByte();
//        float avg = (m1 + m2 + m3) / 3.0f;
//        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
//        {
//            System.out.println("Pass");
//        }
//        else
//        {
//            System.out.println("Fail");
//        }

        // Question 3
//        float tax = 0f;
//        float income;
//        System.out.println("Enter your income in lakhs per annum: ");
//        income = sc.nextFloat();
//        if(income<=2.5f)
//        {
//            tax = tax + 0f;
//        }
//        else if(income>2.5f && income<=5.0f)
//        {
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income<=10.0f && income>5.0f)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f)
//        {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax payed by the employee is: "+ tax);

        // Question 4
//        System.out.println("Enter your day: ");
//        int day = sc.nextInt();
//
//        switch (day)
//        { // This is a enhanced switch case system not a traditional system, here it does not require the break statement.
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        // Question 5
//        System.out.println("Enter a year: ");
//        int year = sc.nextInt();
//
//        if((year%4)==0)
//        {
//            System.out.println("Leap year");
//        }
//        else
//        {
//            System.out.println("Not a leap year");
//        }

        // Question 6
        System.out.println("Enter your url: ");
        String  url = sc.next();

        if(url.endsWith(".org"))
        {
            System.out.println("Organisation.");
        }
        else if(url.endsWith(".com"))
        {
            System.out.println("Commercial");
        }
        else if(url.endsWith(".in"))
        {
            System.out.println("Indian website");
        }
        else
        {
            System.out.println("sorry.");
        }


    }
}
