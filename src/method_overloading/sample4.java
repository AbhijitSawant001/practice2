package method_overloading;

public class sample4 
{
	public void division(int a, int b)
	
	{
		System.out.println("division="+(a/b));
		
	}
	
	public void division(int a, int b, int c) 
	{
		System.out.println("division="+(a/b*c));
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		sample4 s4=new sample4();
		s4.division(50, 2);
		s4.division(4, 2, 3);
	}
}
