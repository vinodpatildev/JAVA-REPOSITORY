package InputOutput;
import java.io.*;


public class BufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input a String :");
		String str = bf.readLine();
		System.out.println("Typed Line :"+str);
		
		System.out.print("Input a Integer :");
		Integer i = Integer.parseInt(bf.readLine());
		System.out.println("Typed Integer :"+i);
		
		
		
	}

}
