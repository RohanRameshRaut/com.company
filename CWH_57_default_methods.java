package com.company;

// An interface can have static and default methods.
// Default methods enables us to add new functionality to existing interfaces
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){ // Interfaces can also include private methods for default methods to use.
        // interface implementing classes i.e MySmartPhone class can not use this method as it has a private access
        // You can use it in here only, or in default method for privacy or avoid lengthy code in default method.
        System.out.println("Good morning");
    }
//    void record4KVideo(); will create an error in below MySmartPhone class as it is updated here
    default void record4KVideo(){ // we can use this to add a new method in existing interface, by using default
        greet();
        System.out.println("Recording in 4k.....");
    }
}
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling "+ phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
//    public void record4KVideo(){ // You can overwrite the default method.
//        System.out.println("Recording in 4K after taking snap....");
//    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public String[] getNetwork(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class CWH_57_default_methods {
    public static void main(String[] args) {
       MySmartPhone ms = new MySmartPhone();
       String[] ar = ms.getNetwork();
       for(String item: ar){
           System.out.println(item);
       }
       ms.record4KVideo();
//       ms.greet(); // error, as it has private access

    }
}
