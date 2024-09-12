import java.util.*;


public class throwKeyword {
	public static void main(String [] args) throws MyException{
//		The throw keyword is used to explicitly throw a single exception.
//		throw new ArithmeticException("Trying to divide by 0"); // throwing an error by creating an object (new ArithmeticException).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		if(age> 100) {
			throw new MyException();
		}
	}
}

class MyException extends Exception{
	public MyException() {
		System.out.println("MyException");
	}
}