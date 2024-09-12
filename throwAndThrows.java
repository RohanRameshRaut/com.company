import java.util.*;
import java.io.*;

// NOTE: READ THE ERRORS FROM THE BOTTOM TO UPWARD, CAUSE IT'S A STACK.
class Main{
	public static void findFile() throws IOException { // This is just a way(not compulsory just precaution) to tell the other programmers that this method might throw an error(IO exception) error so, be prepared to handle it or put the calling in try-catch block.
//		code that may produce IOException
		File newFile = new File("text.txt");
	}
}
public class throwAndThrows {
	public static void main(String [] args) {
//		We use the throws keyword in the method declaration to declare the type of exceptions that might occur within it.
		int a [] = new int[5];
//		try {
//			getNumberFromArray(a);
//		}catch(Exception e){
//			System.out.println("Catched the exception" + e.getMessage());
//		}
		getNumberFromArray(a);
	}
	static int getNumberFromArray(int a[])throws ArithmeticException{
		return a[8];
	}
}
