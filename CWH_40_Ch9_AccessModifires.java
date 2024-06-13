package com.company;

class MyEmployee{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class CWH_40_Ch9_AccessModifires {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 78;
//        harry.name = "CodeWithHarry"; --> Throws an error due to private modifier.

        harry.setId(78);
        harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
