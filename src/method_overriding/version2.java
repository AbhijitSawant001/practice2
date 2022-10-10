package method_overriding;

public class version2 extends version1
{
	public void add(int a, int b)
	{
			System.out.println("multiplication="+(a*b));
	}
	
	public void sub(int c, int d)
	{
		System.out.println("division="+(c/d));
	}
}
