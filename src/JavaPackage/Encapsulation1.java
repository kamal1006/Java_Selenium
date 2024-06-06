package JavaPackage;

public class Encapsulation1 {
	
	String s= "Java";
	
	final int c=2;  // we cann't change the value of c
	
	void a() {
		System.out.println("Enapsulation1 ,Method a");
		//c = 5;  Cann't change the value of c 
 		
	}
	
	 final void d(){
		System.out.println("Hello i am final method");     // we cann't access this method
	}

}
