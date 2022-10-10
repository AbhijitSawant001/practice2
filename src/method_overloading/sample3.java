package method_overloading;

public class sample3 
{
		public void multiplication(int a, int b)
		
		{
			System.out.println("multiplication="+(a*b));
			
		}
		
		public void multiplication(int a, int b, int c) 
		{
			System.out.println("MULTIPLICATION="+(a*b*c));
		}
		
		
		public static void main(String[] args) {
			
			
			
			sample3 s3=new sample3();
			s3.multiplication(50, 2);
			s3.multiplication(4, 2, 3);
		}
}
