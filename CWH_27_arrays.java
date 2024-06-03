public class CWH_27_arrays {
    public static void main(String[] args) {
        // int [] marks = {98, 45, 79, 99, 80};
//        float [] marks = {98.1f, 45.7f, 79.87f, 99.5f, 80.5f};
//        System.out.println(marks[4]);
//        System.out.println(marks.length);

//        String [] students = {"Harray", "Rohan", "Shubham", "Lovish"};
//        System.out.println(students[2]);
//        System.out.println(students.length);

        int [] marks = {98, 45, 79, 99, 80};

        // Displaying the Array (Naive way).
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop).
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        // Displaying the Array in reverse order (for loop).
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length-1; i>=0; i--)
        {
            System.out.println(marks[i]);
        }

        // Displaying the Array (for-each loop).
        System.out.println("Printing using for-each loop");
        for(int element: marks)
        {
            System.out.println(element);
        }

    }
}
