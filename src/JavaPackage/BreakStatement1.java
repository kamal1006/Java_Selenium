package JavaPackage;

public class BreakStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0; i<10; i++)
		{
			System.out.println(i);
			if(i==5)
			{
				break;
			}
		}
		System.out.println("Control Came out of loop");

	}

}
