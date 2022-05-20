package InputOutput;
import java.io.*;

public class InputMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Vinod");
		
		//System.in: This is the standard input stream that is used to read characters from the keyboard or any other standard input device
		InputStreamReader isr = new InputStreamReader(System.in);
		//isr.read()
		
		//System.err:standard error stream that is used to output all the error
		System.err.println("Error");
		
		//Four different Print Methods
		System.out.println("Hello Vinod");
		System.out.print("Hello Vinod");
		System.out.printf("Hello Vinod");
		System.out.format("Hello Vinod");
		
		
		
	}

}
