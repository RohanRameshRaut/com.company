import java.util.*;


public class nestedInnerClass {
	public static void main(String [] args) {
		nestedInnerClass obj = new nestedInnerClass();
		Toy t1 = obj.new Toy(); // this way we can access it, make the outer class's object 1st and then obj.new Toy().
		Playstation p1 = new Playstation(); // we can directly access the nested class form static method cause, the class is also a static class.
	}
	
	class Toy{ // this is a non-static nested class, we can't make the object of a inner class directly it in a main method cause, main method is a static method.
		int price;
	}
	
	static class Playstation{ // this is the other way 
		int price;
	}
	
}

