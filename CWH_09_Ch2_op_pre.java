public class CWH_09_Ch2_op_pre {
    public static void main(String[] args) {
//        int a = 6*5-34/2; // Usually java does not follow BODMAS
        /*
        highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity.

           =30-34/2
           =30-17
           =13

         */
//        int b = 60/5-34*2;
        /*

        If precedences are same then Associativity is used.
           =12-34*2
           =12-68
           =-56

        */

//        System.out.println(a);
//        System.out.println(b);
        // Precedence(kon bada hai) & Associativity(Left to right or right to left evaluation)

        // Quick Quiz

        int x = 6, y=1;
        int k = x * y/2;
        System.out.println(k);

        int b = 1;
        int c = 4;
        int a = 5;
        int l = b*b - (4*a*c)/(2*a);
        System.out.println(l);
    }
}
