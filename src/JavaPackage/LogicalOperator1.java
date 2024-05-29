package JavaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=0;
		
		//Logical 
		System.out.println(a>b &&  a>c);//True
		System.out.println(a<c &&  ++a<b);//False
		System.out.println(a);
		
		//Bitwise
		System.out.println(a<b &  ++a<c);
		System.out.println(a);

	}

}
