package com.company;

// Group of related methods with empty bodies called javaInterfaces.
interface Bicycle{ // It will not create an object
    // Below 2 methods are related to class Bicycle and they are empty, cause any cycle brand(brandClass) should have at least these 2 basic methods, its compulsory.
    int a = 45; // interface can have properties also
     void applyBrake(int decrement);
     void speedUp(int increment);
}
interface HornBicycle{
    int a = 45;
    void blowHorn3g();
    void blowHornhn();
}
// two parents one child
class AvonCycle implements Bicycle, HornBicycle{ // Like  inheritance has extend keyword interface has implements keyword.
    int speed = 7;
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
        speed = speed - decrement;
    }
    public void speedUp(int increment){
        System.out.println("Incresing speed");
        speed = speed + increment;
    }
    public void blowHorn3g(){
        System.out.println("3g horn kabhi khushi kabhi gum pee pee pee");
    }
    public void blowHornhn(){
        System.out.println("hn horn mai hun na po po po ");
    }
}

class RangerCycle implements Bicycle{ // Like  inheritance has extend keyword interface has implements keyword.
    public void applyBrake(int decrement){
        System.out.println("Applying RangerCycle brake");
    }
    public void speedUp(int increment){
        System.out.println("Incresing RangerCycle speed");
    }
}
public class CWH_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
//        cycleHarry.applyBrake(1);
//        // You can create properties in interfaces
//        System.out.println(cycleHarry.a);
//        // You can not modify the  properties in Inheritance as they are final
////        cycleHarry.a = 46; // error
//        System.out.println(cycleHarry.a);

//        RangerCycle cycleRohan = new RangerCycle();
//        cycleRohan.applyBrake(4);

        cycleHarry.blowHorn3g();
        cycleHarry.blowHornhn();






    }
}
