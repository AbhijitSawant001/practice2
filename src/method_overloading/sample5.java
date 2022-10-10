package method_overloading;

import java.util.Scanner;

public class sample5 
{
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter value of a= ");
		int a= sc.nextInt();
		System.out.print("Enter value of b= ");
		int b= sc.nextInt();
		System.out.print("Enter value of c= ");
		int c= sc.nextInt();
		sample5 s5=new sample5();
		System.out.println("***********************************");
		s5.m1(a, b);
		s5.m1(a, b, c);
		
		sample6 s6=  new sample6();
		s6.m1(a, b);
		s6.m1(a, b, c);
		
		
	}
	
	public void m1(int a, int b)
	
	{
		System.out.println("ADDITION="+(a+b));
	}
	
	public void m1(int a, int b, int c)
	{
		System.out.println("addition of 3 numbers="+(a+b+c));
	}
}
