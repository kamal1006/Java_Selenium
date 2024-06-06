package JavaPackage;

public class MethodOverload1 {

	
	// user defined non static method
	public void Sum(int a, int b)
	{
	System.out.println(a+b);	
	}
	// user defined non static method
	public void Sum(double a , double b) 
	{
		System.out.println(a+b);
	}
	
	public void Sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
