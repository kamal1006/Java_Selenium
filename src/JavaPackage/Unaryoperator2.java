package JavaPackage;

public class Unaryoperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=10;
		
		System.out.println(a++);  //10,11
		System.out.println(a++  +  ++a); //11,12,13,13  //11+13=24
		System.out.println(a++); //13,14
		
		System.out.println(b++ + b--);   //10,11,11,10  //10+11=21
		System.out.println(b); //10

	}

}
