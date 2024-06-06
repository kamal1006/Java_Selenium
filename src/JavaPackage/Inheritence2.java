package JavaPackage;

public class Inheritence2 extends Inheritance1 {
	
	//Child Class-  Inheritence 2
	//Parent Class- Inheritence 1
	
	 int b =10;   //global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inheritence2 v2=new Inheritence2();
		
		System.out.println(v2.a);
		System.out.println(v2.b);
		v2.java();
		//v2.selenium();  private method is not accessible

	}

}
