import java.util.*;

// In java, It is possible to create a Inner class without giving any name.
// Anonymous classes usually extend subclasses or implement interfaces.

// How to create a anonymous inner class(a superclass that an anonymous class extends)?
//ans:- 1) Create a class with name(normal class).
//      2) Just make an object of that class.
//  	3) And instead of doing this: OuterClass obj = new OuterClass();
//    	4) Do this: OuterClass obj = new OuterClass(){  };
// 		5) Yes, instead of closing it you can define it right there only.
//      6) This anonymous class is one time use only i.e available there only.
// 		7) Rest is same as other classes.


//  method02
// How to create a anonymous inner class(an interface that an anonymous class implements)?
// 

interface SuperInterface{
	
	void interfaceMethod();
	
}
class OuterClass{
	public void outerMethod() {
		
	}
}

public class anonymousClass {
	public static void main(String [] args) {
		OuterClass obj = new OuterClass() { // the obj object is of anonymous class's object not the super class object.
			void sing() {
				
			}
//		    overriding 
			public void outerMethod() {
				
			}
		};
		
		// method02
		SuperInterface obj2 = new SuperInterface() { // the obj2 is an object of an anonymous class not interface.
//	   As it is a anonymous we can't see the name but it is there, cause the anonymous class is implementing an interface.
			
			public void interfaceMethod() {
				
			}
		};
	}
}
