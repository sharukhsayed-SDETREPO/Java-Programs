package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		
		for(int q=1;q<=num;q++) {
			if(num%q==0) {
				count++;
			}
			
			
		}
		if(count==2) {
			System.out.println("prime number");
		}
		
		
		else {
			System.out.println("not a prime number");
		}	
				

	}

}
