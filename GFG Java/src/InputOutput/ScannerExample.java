package InputOutput;
import java.io.*;
import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
//		Integer: nextInt()
//		Float: nextFloat()
//		String : nextLine()
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Integer :");
		Integer i = sc.nextInt();
		System.out.println("Typed Integer :"+i);
		
		System.out.print("Enter Float :");
		Float f = sc.nextFloat();
		System.out.println("Typed Float :"+f);
		
		System.out.print("Enter String :");
		sc.nextLine();
		String s = sc.nextLine();
		System.out.println("Typed String :"+s);
		
		

		
	}

}
