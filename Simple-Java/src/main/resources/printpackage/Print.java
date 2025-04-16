import org.testng.annotations.Test;

public class Print 
{	
	@Test
	public static void print()
	{
		System.out.println("This method print ");
	}
	
	@Test
	public static void add()
	{
		System.out.println("This method add 5 + 5 = " + (5+5));
	}
	
	@Test
	public static void sub()
	{
		System.out.println("This method subtract 10 - 5 = " + (10-5));
	}
	
	@Test
	public static void mul()
	{
		System.out.println("This method multiply 7 * 5 = " + (7*5));
	}

}