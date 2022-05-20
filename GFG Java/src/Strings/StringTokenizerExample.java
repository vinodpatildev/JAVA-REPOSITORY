package Strings;
import java.util.*;
public class StringTokenizerExample {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Vinod is the best programmer."," ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
