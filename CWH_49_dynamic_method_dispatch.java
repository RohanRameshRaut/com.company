package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone(); // Allowed
//        obj.name();

        Phone obj = new SmartPhone(); // aapka reference super class ka hai, aur aapka object subclass ka hai, tab aap ye kar sakte ho.
//        SmartPhone obj2 = new Phone(); // Not allowed
        // Samsung galaxy S22 ultra is a smartPhone as well as simple phone also, However Nokia is a phone but not a smartPhone.
        // ex: A Nokia and a Samsung galaxy S22 ultra both could be phones but not the SmartPhone, only Samsung galaxy S22 ultra is smart phone but Nokia and Samsung galaxy S22 ultra are Phones.
        // like SmartPhone is a subtype of Phone.
        obj.showTime();
        obj.on(); // It will turn on the SmartPhone as it is an object of a SmartPhone
//        obj.music(); // Not allowed

//        *** Dynamic Method dispatch:- Which method is going to run is decided at the runTime, cause object is created at the runTime is called Dynamic Method dispatch
        // isko kehte hai Dynamic Method dispatch kyunki jo method hai vo runTime pe decide hota hai ki konsa run hona hai kyunki object aapka runTime pe banta hai.

        // --> Above is a good Example of runTime polymorphism: As you already know that obj is an object of SmartPhone(), toh vo usike methods run krega toh ye runTime polymorphism kaise huaa? --> obj iss object ka creation runTime pe hota hai as you used the new keyword (i.e dynamically creation of object).

    }
}
