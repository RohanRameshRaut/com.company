package com.company;

class Students{
    int roll;
    String name;
    String course;
    public void setDetails(int r, String n, String c){
        roll = r;
        name = n;
        course = c;
    }
    public void getDetails(){
        System.out.println("Student roll: "+roll );
        System.out.println("Student name: "+name );
        System.out.println("Student course: "+course );
    }
};

public class random {
    public static void main(String[] args) {
        System.out.println("This is the random java Program file");
        Students rohan = new Students();
//        rohan.roll = 66;
//        rohan.name = "Rohan Raut";
//        rohan.course = "BBACA";
//        or
        rohan.setDetails(67, "Rohan Das", "Bcom");
        rohan.getDetails();
    }
}
