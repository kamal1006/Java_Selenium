package JavaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =300;
		int b =300;
		
		if(a!=b) {
			System.out.println("a and b not equal");
		}else {
			System.out.println("a and b are equal");
		}
		
		String p ="Hello";
		String q ="hello";
		
		if(p==q) {
			System.out.println("p and q are equal");
		}else {
			System.out.println("p and q are not equal");
		}
		if(p.equals(q)) {
			System.out.println("p and q are equal in 2nd way");
		}else {
			System.out.println("p and q are not equal in 2nd way");
		}
		if(p.equalsIgnoreCase(q)) {
			System.out.println("p amd q are equal in third case");
		}else {
			System.out.println("p and q are not equal in third case");
		}

	}

}
