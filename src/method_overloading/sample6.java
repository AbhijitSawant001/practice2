package method_overloading;

public class sample6 extends sample5

{
		public void m1(int a, int b)
		{
			System.out.println("substraction="+(a-b));
		}
		public void m1(int a, int b, int c)
		{
			System.out.println("answer="+(a+b-c));
		}
		
}
