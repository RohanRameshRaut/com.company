public class CWH_24_break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops
//        for(int i=0;i<5;i++)
//        {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2)
//            {
//                System.out.println("Ending the loop");
//                // The break statement is used to exit the loop irrespective of whether the condition is true or false, whenever a "break" is encountered inside the loop, the control is sent outside the loop.
//                break;
//            }
//        }
//        int i =0;
//        while(i<5)
//        {
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2)
//            {
//                System.out.println("ending the whileLoop");
//                break;
//            }
//            i++;
//        }
//        System.out.println("Loop ends here");

        //Continue

        for(int i=0;i<5;i++)
        {

            if(i==2)
            {
                System.out.println("Ending the loop");
                // The continue statement is used to immediately move to the next iteration of the loop.
                // The control is taken to the next iteration thus skipping everything below "continue" inside the loop for that iteration.

                continue; // It will this loop for i==2 (continue ke nicheke lines ko skip kro).
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

    }
}
