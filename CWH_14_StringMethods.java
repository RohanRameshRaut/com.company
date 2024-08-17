public class CWH_14_StringMethods {
    public static void main(String[] args) {
//        String a = "Harry";
//        String a1 = new String("Harry");
//        System.out.println(a);
//        System.out.println(a1);

//        STRING METHODS
        String name = "Harry";
//        int value = name.length();
//        System.out.println(value);
//
//        String lstring = name.toLowerCase(); // monstly all the string methods uses camel cases ex: toLowerCase();
//        System.out.println(lstring);

//         // Naming Conventions
//            1) Pascal Case --> PascalCase
//            2) Camel Case --> camelCase
//            3) Snake Case --> snake_case
//            4) Kebab Case --> kebab-case (came from barbeque seek kabab)
//            5) Flat Case --> flatcase
//            6) Upper Flat Case --> UPPERFLATCASE
//            7) Pascal Snake Case --> Pascal_Snake_Case
//            8) Camel Snake Case --> camel_Snake_Case
//            9) Cobol Case --> COBOL-CASE





//        String ustring = name.toUpperCase();
//        System.out.println(ustring);
//
//        String nonTrimmedString = "        Harry       ";
//        System.out.println(nonTrimmedString);
//        String trimmedString = nonTrimmedString.trim();
//        System.out.println(trimmedString);

//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,4)); // start index is included and last index is excluded.

//        System.out.println(name.replace('r', 'p'));
//        System.out.println(name.replace("rry", "ier")); // ''-->for character and ""-->for subString.

//        System.out.println(name.startsWith("Har"));
//        System.out.println(name.endsWith("Har"));

//        System.out.println(name.charAt(2));

//        System.out.println(name.indexOf("r"));
//        System.out.println(name.indexOf("Harry")); // returns the first index of a given string.

        String modifiedName = "Harryrryrry";
//        System.out.println(modifiedName.indexOf("rry")); //will return 2 as rry starts from index 2 first.
//        System.out.println(modifiedName.indexOf("rry", 4)); //will start searching from the given index i.e 4
//
//        System.out.println(modifiedName.lastIndexOf("r")); // returns the last index of the given string
//        System.out.println(modifiedName.lastIndexOf("rry", 7)); // will search upto 7th index only

//        To check the given two strings are equal or not then use .equals method not the equal sign
        System.out.println(modifiedName.equals(name)); // will return boolean
        System.out.println(name.equals("Harry")); // will return boolean
        System.out.println(name.equalsIgnoreCase("harry")); // will ignore the caseSensitivity of the strings






    }
}
