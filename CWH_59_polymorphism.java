package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k.....");
    }
}
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling "+ phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
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
    public void sampleMeth(){
        System.out.println("meth of MySmartPhone2");
    }
}
public class CWH_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // This is a SmartPhone, however you can only use it as a camera.
        // cam1 is a reference of MyCamera2 and an object of a MySmartPhone2 class, so you can use the methods of MyCamera2 only.
//        cam1.getNetworks(); --> Not allowed
//        cam1.sampleMeth(); --> Not allowed
        cam1.takeSnap();
        cam1.recordVideo();
        cam1.record4KVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.record4KVideo();
        s.getNetwork();
        s.callNumber(911);
        s.connectToNetwork("rohan");

//        Note: Implementing an interface forces method implementation.
    }
}
