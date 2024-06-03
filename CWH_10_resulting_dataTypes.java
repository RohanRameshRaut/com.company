public class CWH_10_resulting_dataTypes {
    public static void main(String[] args) {
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        int a1 = y+z;
//        int a = 45 + 4;
//        float b = 6.54f + 6;

        // Increment and Decrement Operators
        int i = 56;
//        int b = i++; // First b is assigned i then i is incremented.
        int j = 67;
        int c = ++j; // First j is incremented then c is assigned j (68).
        System.out.println(i++); // (Normal i) Use the i first and then increment it.
        System.out.println(i); // (Incremented)
        System.out.println(++i); // Increment the i first and then use it.
        System.out.println(i);
        int y = 7;
        System.out.println(++y*8);
        char ch = 'a';
        System.out.println(++ch); // will be b.

    }
}
