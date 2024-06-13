package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("My Name is: "+name);
    }
    public int getSalary(){
       return salary;
    }
};

public class CWH_38_custom_class {
    public static void main(String[] args) {
        // video no: 36, 37-->Theory only basic OOPS concept 1) Abstraction 2) Encapsulation 3) Inheritance 4) Polymorphism
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();

        // Setting Attributes for harry
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary = 34000;

        // Setting Attributes for john
        john.id = 17;
        john.name = "John Tripathi";
        john.salary = 12000;

        // Printing the Attributes
        System.out.println(harry.id);
        System.out.println(harry.name);

        // Printing the method(member function called method).
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);


    }
}
