package Strings;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringClass1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr);
		System.out.println(s_byte);
		
		Charset cs = Charset.defaultCharset();
		String s_byte_char = new String(b_arr, cs); 
		System.out.println(s_byte_char);
		
		String str = new String(b_arr, "US-ASCII"); 
		System.out.println(str);
		
//		4.String(byte[] byte_arr, int start_index, int length) – Construct a new string from the bytes array depending on the start_index(Starting location) and length(number of characters from starting location).
		String str1 = new String(b_arr, 1, 3);
		System.out.println(str1);
		
//		5.String(char[] char_arr) – Allocates a new String from the given Character array
		char char_arr[] = {'G', 'e', 'e', 'k', 's'};
		String str2 = new String(char_arr);
		System.out.println(str2);
		
//		String Methods
		String s= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");
  
        // Returns the number of characters in the String.
        System.out.println("String length = " + s.length());
  
        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                           + s.charAt(3));
  
        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + s.substring(3));
  
        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + s.substring(2,5));
  
        // Concatenates string2 to the end of string1.
        String s1 = "Geeks";
        String s2 = "forGeeks";
        System.out.println("Concatenated string  = " +
                            s1.concat(s2));
  
        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
  
        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " + s4.indexOf('a',3));
  
        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);
  
        out = "Geeks".equalsIgnoreCase("gEeks ");
        System.out.println("Checking Equality " + out);
          
        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " + word1.toLowerCase());
  
        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " + 
                            word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  
        // Replacing characters
        String str3 = "feeksforfeeks";
        System.out.println("Original String " + str3);
        String str4 = "feeksforfeeks".replace('f' ,'g');
        System.out.println("Replaced f with g -> " + str4);
	}

}
