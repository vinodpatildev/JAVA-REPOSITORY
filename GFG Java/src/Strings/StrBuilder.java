package Strings;

public class StrBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		for(int i=0; i<100; i++) {
			sb.append("V");
		}
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}

}
