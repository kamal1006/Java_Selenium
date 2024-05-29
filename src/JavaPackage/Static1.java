package JavaPackage;

public class Static1 {
	int x = 100; //Defining Global variable 
	String s ="Selenium";  //Defining Global variable
	static int y = 100;   //Defining a static variable 
	
	
	//Static method
	public static void main(String[] args) {
		// TODO Auto-generated method 
		String  s = "Hi"; //Local Variable
		System.out.println(s); //Calling i variable
//		Method2();  // error Cann't call static method inside main method
		

	}
	
	// Non Static Method
	public void Method2() {
		int i = 100; //Local Variable
		System.out.println(i); //Calling i variable
	}

}
