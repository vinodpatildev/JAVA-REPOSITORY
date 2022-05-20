package Variables;

public class variables
{
	static int x = 11;
	private int y = 33;
	public void method1(int x)
	{
		variables t = new variables();
		this.x = 22;
		y = 44;
		variables t2 = new variables();
		

		System.out.println("Test.x: " + variables.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
		System.out.println("t2.y: " + t2.y);
	}

	public static void main(String args[])
	{
		variables t = new variables();
		t.method1(5);
	}
}
