package Arrays;


public  class ArrayExamples {
	public static class Student
	{
	    public int roll_no;
	    public String name;
	    Student(int roll_no, String name)
	    {
	        this.roll_no = roll_no;
	        this.name = name;
	    }
	    public String toString() {
	    	return "Roll No:"+roll_no + " Name :"+name;
	    }
	}
	public static int[] m1()
	{
	    // returning  array
	    return new int[]{1,2,3};
	}
	public static void main(String[] args) {
		int[] arr;
        
	      // allocating memory for 5 integers.
	      arr = new int[5];
	         
	      // initialize the first elements of the array
	      arr[0] = 10;
	         
	      // initialize the second elements of the array
	      arr[1] = 20;
	         
	      //so on...
	      arr[2] = 30;
	      arr[3] = 40;
	      arr[4] = 50;
	         
	      // accessing the elements of the specified array
	      for (int i = 0; i < arr.length; i++) {
	         System.out.println("Element at index " + i +" : "+ arr[i]);
	      }
	      System.out.println("-----------------------------");
	      int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
	      for(int i:intArray) {
	    	  System.out.println(i);
	      }
	      System.out.println("-----------------------------");
	      Student[] array = new Student[5];
	      array[0] = new Student(1,"aman");
	        array[1] = new Student(2,"vaibhav");
	        array[2] = new Student(3,"shikar");
	        array[3] = new Student(4,"dharmesh");
	        array[4] = new Student(5,"mohit");
	      for(Student i:array) {
	    	  System.out.println(i);
	      }
	      System.out.println("--------------MULTIDIMENTIONAL ARRAYS---------------");
	      int Arr[][] = { {2,7,9},{3,6,1},{7,4,2} };
	      
	        // printing 2D array
	        for (int i=0; i< 3 ; i++)
	        {
	            for (int j=0; j < 3 ; j++)
	                System.out.print(Arr[i][j] + " ");
	 
	            System.out.println();
	        }
	      int arr1[] = m1();
	      System.out.println("---------------------COPYING ARRAY-----------------------");
	      int IntArray[] = {1,2,3};
	         
	        int cloneArray[] = IntArray.clone();
	         
	        // will print false as deep copy is created
	        // for one-dimensional array
	        System.out.println(IntArray == cloneArray);
	         
	        for (int i = 0; i < cloneArray.length; i++) {
	            System.out.print(cloneArray[i]+" ");
	        }
	        System.out.println("");
	       System.out.println("-------------------------------------------------------");
	       int xarr[][] = new int[3][];
	       
	}
}
