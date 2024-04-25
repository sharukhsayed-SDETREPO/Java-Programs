package JavaPrograms;

import java.util.Scanner;

public class Greaterof3Numbers {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your first number");
	int a=sc.nextInt();
	System.out.println("Enter your second number");	
	int b=sc.nextInt();
	System.out.println("Enter your third number");	
	int c=sc.nextInt();
	int larget2=c>(a>b?a:b)?c:(a>b?a:b);
	System.out.println("largets of 3 number is " + larget2);
			
	}

}
