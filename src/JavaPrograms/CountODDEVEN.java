package JavaPrograms;

import java.util.Scanner;

public class CountODDEVEN {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	
	int oddC=0;
	int evenC=0;
	
	while(num>0) {
		int rev=num%10;
		
		
		if (rev%2==0) {
			evenC++;
		}
		else 
		{
			oddC++;
		}
		num=num/10;
	}

	
	System.out.println("Your even count is " +  evenC);
	System.out.println("Your odd count is " + oddC);
	}

}
