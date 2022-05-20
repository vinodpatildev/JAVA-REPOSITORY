package Strings;
import java.util.*;
public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(" ");
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Saket");
		arr.add("is");
		arr.add("a");
		arr.add("good");
		arr.add("programmer");
		
		for(int i=0; i<arr.size(); i++) {
			sj.add(arr.get(i));
		}
		System.out.println(sj);		
	}

}
