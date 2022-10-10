package method_overriding;

public class demo3
{
	public static void main(String[] args) {
		
		demo1 d1=new demo1();
		d1.car();
		d1.home();
		d1.money();
		
		System.out.println("**********************************************");
		
		demo2 d2=new demo2();
		d2.car();
		d2.money();
		d2.home();
		
		
	}
}
