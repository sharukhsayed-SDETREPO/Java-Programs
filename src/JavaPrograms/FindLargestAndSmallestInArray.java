package JavaPrograms;

public class FindLargestAndSmallestInArray {

	public static void main(String[] args) {
		int a[] = {100,2,3,4,5,6,7,8,9};
		
		
		int max=a[0];
		int min =a[0];
		
		
		for (int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if (a[i]<min) {
				min=a[i];
			}
			
		
		}
		
		
		System.out.println("maximum value in a array :" + max);
		System.out.println("minimum value in a array :" + min);   
	}

}
