package JavaPrograms;

public class swappingNumbersIn {

	public static void main(String[] args) {
		int a=10 ,b=20;
		//1.using a third variable
		System.out.println("before swap :a= "+ a +" b =" +b);
		int t=a;
		a=b;
		b=t;
		System.out.println("after swap :a= "+ a +" b =" +b);
		//2.without using 3rd variable with + and - 	
		a=a+b;
		b=a-b;
		a=a-b;
		//3..without using 3rd variable with * and / non zero 
		a=a*b;
		b=a/b;
		a=a/b;
		//4.bitwise XOR(^)
		a=a^b;
		b=a^b;
		b=a^b;
		//5.using a single statement
		b=a+b-(a=b);
		
		
	}

}
