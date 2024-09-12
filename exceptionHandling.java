import java.util.*;

public class exceptionHandling {
	public static void main(String [] args) {
		int a[] = new int[5];
//		System.out.println("Hello World.");
		
		try {
			
			int result = 5/0;
			System.out.println(a[8]);
		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Tried to acces the out of bound element");
//		}
//		catch(ArithmeticException e) {
//			System.out.println(e.getStackTrace());
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			System.out.println(e);
//		}
//		catch(ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e) {
//			
//		}
//		catch(RuntimeException e) {
//			
//		}
//		or
//		catch(Exception e) {
////			All types of exceptions are handled here
//			System.out.println("Exceptions Handled");
//		}
//		finally {
//			System.out.println("I will run always.");
//		}
		finally { //you can use finally with immediate after the try block.
			System.out.println("I will run always.");
		}
		
	}
}
