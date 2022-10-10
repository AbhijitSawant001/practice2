package method_overloading;

public class sample1 
{
		public void addition(int a, int b)
		
		{
			System.out.println("ADDITION="+(a+b));
		}
		
		public void addition(int a,int b, int c)
		{
			System.out.println("ADDITION="+(a+b+c));
		}
		
		
		public static void main(String[] args) {
			
			sample1 s1=new sample1();
			s1.addition(30, 40);
			s1.addition(50, 80, 60);
			
			
		}
}
