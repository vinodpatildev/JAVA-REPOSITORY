package FlowControl;

public class Loops {

	public static void main(String[] args) {
		String array[] = {"Ron", "Harry", "Hermoine"};
		  
        //enhanced for loop
        for (String x:array)
        {
            System.out.println(x);
        }
        
        //Do while loop
        int x = 21;
        do
        {
            System.out.println("Value of x:" + x);
            x++;
        }while (x < 20);
	}

}
