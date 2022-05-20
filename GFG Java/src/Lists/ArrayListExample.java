package Lists;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		for(int i=0; i<10; i++) {
			arr.add(i+1);
		}
		arr.add(0,99);
		System.out.println(arr);
		ArrayList<Integer> arr1 = (ArrayList<Integer>) arr.clone();
		System.out.println(arr1);
		arr1.add(0,100);
		System.out.println(arr);
		arr1.set(0, 111);
		System.out.println(arr1);
		Iterator it = arr1.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
