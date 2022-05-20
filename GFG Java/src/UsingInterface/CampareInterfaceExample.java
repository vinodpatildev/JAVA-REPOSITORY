package UsingInterface;

import java.util.*;



class Student{
	int rollNo;
	String name,address;
	
	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public String toString() {
		return "Roll No :"+this.rollNo+", Name :"+this.name+", Address:"+this.address;
	}
}
class SortByRollNo implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.rollNo - s2.rollNo;
	}
}

public class CampareInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Student> arr = new ArrayList<Student>();
		 
		 arr.add(new Student(111, "Mayank", "london"));
	     arr.add(new Student(131, "Anshul", "nyc"));
	     arr.add(new Student(121, "Solanki", "jaipur"));
	     arr.add(new Student(101, "Aggarwal", "Hongkong"));
	     
	     System.out.println("Unsorted Array :");
	     for(int i=0; i<arr.size(); i++) {
	    	 System.out.println(arr.get(i));
	     }
	     
	     Collections.sort(arr, new SortByRollNo());
	     
	     System.out.println("Sorted   Array :");
	     for(int i=0; i<arr.size(); i++) {
	    	 System.out.println(arr.get(i));
	     }
		 
	}

}
