package UsingInterface;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class NewStudent{
	int rollNo;
	String name;
	
	public NewStudent(String name,int rollNo) {
		this.rollNo= rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return this.rollNo+" "+this.name;
	}
	
	public Integer getRollNo() {
		return this.rollNo;
	}
	public String getName() {
		return this.name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	static class Sorter implements Comparator<NewStudent>{
		public int compare(NewStudent s1, NewStudent s2) {
			int rollNoCheck = s1.getRollNo().compareTo(s2.getRollNo());
			int nameCheck = s1.getName().compareTo(s2.getName());
			
			return rollNoCheck==0? nameCheck : rollNoCheck;
		}
	}
}
public class CompareOnMultipleFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NewStudent> arr = new ArrayList<NewStudent>();
		
		NewStudent obj1 = new NewStudent("Ajay", 27);
		NewStudent obj2 = new NewStudent("Sneha", 23);
		NewStudent obj3 = new NewStudent("Simran", 37);
		NewStudent obj4 = new NewStudent("Ajay", 22);
		NewStudent obj5 = new NewStudent("Ajay", 29);
		NewStudent obj6 = new NewStudent("Sneha", 22);
 
        // Adding customer objects to ArrayList
        // using add() method
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);
        arr.add(obj5);
        arr.add(obj6);
        
        Iterator<NewStudent> studentIterator = arr.iterator();
        System.out.println("Before Sorting :");
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		}
		System.out.println("After  Sorting :");
		Collections.sort(arr,new NewStudent.Sorter());
		for(NewStudent s:arr) {
			System.out.println(s);
		}
		
		
	}

}
