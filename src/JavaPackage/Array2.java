package JavaPackage;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4},{2,3,4,5},{9,0,5,6}};
		//total no. of arrows
		int row= a.length;
		System.out.println("Total number of rows " + row);
		
		//total number of columns
		int column=a[0].length;
		System.out.println("Total number of columns "+ column);
		
		// Outer Loop 
		for (int i = 0; i< row; i++)
		{  
			// Inner Loop
			for (int j=0; j< column; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
