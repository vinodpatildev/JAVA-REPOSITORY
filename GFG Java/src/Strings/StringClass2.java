package Strings;

import java.util.*;

public class StringClass2 {

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		  
        // codePointAt()
        System.out.print("Character (unicode point) at index 1 : " + s.codePointAt(1) + "  ");
        System.out.println(s.codePointAt(5));
  
        // codePointBefore()
        System.out.print("Character (unicode point) before index 1 : " + s.codePointBefore(2) + "  ");
        System.out.println(s.codePointBefore(7));
  
        // codePointCount()
        s = "G eek123 G**k";
        System.out.println("Character code point count : "+ s.codePointCount(0, 5));
        
        
        System.out.println("--------------");
        
        System.out.print("Example of join 1 : ");
        System.out.println(
            String.join("^^^", "Geeks", "for", "Geeks"));
  
        System.out.print("Example of join 2 : ");
        ArrayList ll = new ArrayList();
        ll.add("browsing");
        ll.add("geeks");
        ll.add("for");
        ll.add("geeks");
        ll.add("is");
        ll.add("fun");
        System.out.println(String.join(" ", ll));
        
        
        System.out.println("-------------");
        String s5 = "geeksforgeeks";
        
        CharSequence cs = s5.subSequence(0,5);
        System.out.println(cs);
	}
}
