package JavaPackage;

public class Static6 {
	int x = 10;
	static int y=5;
	
	// uSER defined
	public void a() {
		int z =10;
		System.out.println(z);
	}

	static int b =100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static6 s6 = new Static6();
		s6.a();
		System.out.println(s6.b);   // Not Correct
		System.out.println(Static6.b);   // Correct
		System.out.println(b);

	}

}
