package method_overloading;

public class sample2 

{
		public void sub(int num1, int num2)
		{
			System.out.println("subtraction="+(num1-num2));
		}
		
		public void sub(int num1, int num2, int num3)
		{
				System.out.println("subtraction="+(num2-num3-num1));
		}
		
		public void sub(int num5, int num4,float num6) 
		{
			System.out.println("subtraction="+(num5-num6+num4));
		}
		
		public static void main(String[] args) {
			
			sample2 s2=new sample2();
			s2.sub(10, 220);
			s2.sub(20, 60, 30.25f);
			s2.sub(50, 55, 62);
			
			
		}
}
