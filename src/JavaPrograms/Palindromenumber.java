package JavaPrograms;

import java.util.Scanner;

public class Palindromenumber {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
System.out.print("Enter a number :"  );


int num =sc.nextInt();
int org_num=num;



int rev=0;
while(num!=0) {
	rev=rev*10 + num%10;
	
	num=num/10;
}
	System.out.println("reverserd number is " + rev);
	
	
	
	
	if (rev==org_num) {
		System.out.println("palindrome");
	}
	
	
	else {
		System.out.println("not a palindrome");
	}
	
	


	}

}
