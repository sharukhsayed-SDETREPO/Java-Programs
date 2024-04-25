package JavaPrograms;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	
		//Approach 1 _using logic
		
		int  a[]= {1,3,6,7,8,9,9,9,2};
		
		int val=9;
		boolean found=false;
		int lbound=0;
		int ubound=a.length-1;
		while(lbound<=ubound) {
		int mid=	(lbound+ubound)/2;
		
		
		if(a[mid]==val) {
			System.out.println("Your value is present");
			found=true;
			break;
		}
		
		if(a[mid]<val) {
			lbound=mid+1;
		}
		if(a[mid]>val) {
			ubound=mid-1;
		}
		
		
		
		
		
		}
		
		if(found==false) {
			System.out.println("Element not found");
		}
		
		
		
		/////Approach 2 is using inbuilt method 
		Arrays.binarySearch(a, 5);
		
	}

}
