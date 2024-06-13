package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-Name-Here";
    }

    public MyMainEmployee(String n, int i){
        id = i;
        name = n;
    }
    public void setName(String n){name = n;}
    public void setId(int i){id = i;}
    public String getName(){return name;}
    public int getId(){return id;}
}
public class CWH_42_constructors {
    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee();
        MyMainEmployee harry = new MyMainEmployee("CodeWithHarry", 12);

//        harry.setName("CodeWithHarry");

        System.out.println(harry.getId());
        System.out.println(harry.getName());

    }
}
