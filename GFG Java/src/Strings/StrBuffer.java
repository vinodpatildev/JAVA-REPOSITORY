package Strings;

public class StrBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		for(int i=0; i<100; i++) {
			sb.append("V");
		}
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}

}
