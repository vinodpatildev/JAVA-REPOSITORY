package temporary;
import java.lang.*;
import java.util.*;

public class series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans[] = new int[10];
		ans[0] = 115;
		for(int i=0; i<n; i++) {
			if(i!=0) {
				ans[i] = ans[i-1]-i-2;
			}
			System.out.print(ans[i]);	
			System.out.println(" ");
		}
	}
}
