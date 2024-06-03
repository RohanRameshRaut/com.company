public class CWH_25_Ch5_practiceSet {
    public static void main(String[] args) {

        // Problem 1
//        int n = 4;
//        for(int i=n;i>0;i--)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print('*');
//            }
//            System.out.print("\n");
//        }

        // Problem 2
//        int sum = 0, n=3, i=0;
//        while(i<n)
//        {
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);

        // Problem 3
//        int n = 5;
//        for(int i=1;i<=10;i++)
//        {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Problem 4
//        int n = 10;
//        for(int i=10;i>=1;i--)
//        {
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Problem 5
//        int fact = 1, n=5;
//        for(int i=n;i>1;i--)
//        {
//            fact = fact*i;
//        }
//        System.out.printf("Factorial of %d is: %d",n, fact);

        // Problem 6
//        int fact = 1, n=4, i=n;
//       while(i>=1)
//        {
//            fact = fact*i;
//            i--;
//        }
//        System.out.printf("Factorial of %d is: %d",n, fact);

        // Problem 7
//        int n = 4, i=n;
//       while(i>0)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print('*');
//            }
//            System.out.print("\n");
//            i--;
//        }

        // Problem 8
        // ans--> True

        // Problem 9
//        int n=8, sum = 0;
//        for(int i=1;i<=10;i++)
//        {
//            sum = sum + (n*i);
//        }
//        System.out.printf("The sum of numbers occurring in the multiplication table of 8: %d",  sum);

        // Problem 10
        // ans--> At least once

        // Problem 11
        int sum = 0, n=3;
        for(int i=0;i<n;i++)
        {
            sum = sum + (2*i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);

    }
}
