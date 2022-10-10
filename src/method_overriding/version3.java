package method_overriding;

public class version3 
{
	public static void main(String[] args) {
		
		version1 v1=new version1();
		v1.add(10, 20);
		v1.sub(30, 20);
		
		
		System.out.println("*****************************");
		
		version2  v2= new version2();
		v2.add(30, 2);
		v2.sub(50, 3);
		
		
		
	}
}
