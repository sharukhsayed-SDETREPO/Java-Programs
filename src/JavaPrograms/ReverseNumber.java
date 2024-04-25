package JavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	
public static void main (String arg[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	
	int num=sc.nextInt();
	
	int rev =0;
	//1.using logic
	while(num!=0) {
		rev=rev*10 + num%10;/////
		num =num/10;
	}
	
	System.out.println("Reverse number is  :"+rev);
	
	//2.
	long gh= 43534543;
	StringBuilder sb1=new StringBuilder(String.valueOf(gh));
	
	System.out.println(sb1.reverse());

	
	
	
	
	
}
	 
	
	
}
