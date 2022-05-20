package Strings;

public class StringPractice {

	public static void main(String[] args) {
		//String literal is stored in String constant pool
		String s = "vinod";
		
		//String object is stored in Heap
		String a = new String("vinod");
		
		//to store a string inside string constant poop
		String internedString = a.intern();
		
//		StringBuffer is a peer class of String that provides much of the functionality of strings. The string represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
		StringBuffer strbf = new StringBuffer("Heelo Vipul");
		
//		The StringBuilder in Java represents a mutable sequence of characters. Since the String Class in Java creates an immutable sequence of characters, the StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
		StringBuilder str = new StringBuilder("Vipul ");
		str.append("GFG");
		str.setCharAt(0, 'v');
		System.out.println(str);
		
	}

}
