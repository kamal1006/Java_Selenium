package JavaPackage;

public class Array1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int b[] = {1,2,3,4,5};
	String s[] = {"Hello", "Java", "Selenium"};
	Object a[] = {1,2,3,4,"Java",'a'};
	
	System.out.println(a.length); // 6
	System.out.println(b.length); //5
	System.out.println(s.length); //3
	
	System.out.println(s[1]); //Java
	System.out.println(a[5]); //a
	s[1] = "Automation";
	System.out.println(s[1]);  //Automation
 		
	}

}
