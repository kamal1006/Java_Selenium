package javaPrograms100;

import java.util.Scanner;
public class _4UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String s;
		int i;
		float f;
		
		System.out.println("Enter a string");
		s=input.nextLine();
		System.out.println("enetered String "+s);
		
		System.out.println("enter a integer");
		i=input.nextInt();
		System.out.println("Enetered integer is "+ i);
		
		System.out.println("Eneter a float");
		f=input.nextFloat();
		System.out.println("Enetred float "+ f);
		

	}

}
