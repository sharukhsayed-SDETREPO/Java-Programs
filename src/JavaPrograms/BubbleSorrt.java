package JavaPrograms;

import java.util.Arrays;

public class BubbleSorrt {

	
	public static void main(String [] args) {
		int a[]= {1,67,43,23,1};
		
		
		int l=a.length;
		
		for(int i=0;i<l-1;i++) {
			for(int j=0;j<l-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
	System.out.println("Your sorted array is "+Arrays.toString(a));	
	}
}
