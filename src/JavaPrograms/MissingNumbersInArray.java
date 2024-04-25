package JavaPrograms;

public class MissingNumbersInArray {

	
	public static int getMissingNo(int[] arr, int n) {
	    int total = (n + 1) * (n + 2) / 2;
	    int sum = 0;
	    for (int num : arr) {
	      sum += num;
	    }
	    return total - sum;
	  }
	public static void main(String[] args) {
		int[] arr = {1, 2, 4, 5, 6,9};
	    int missing = getMissingNo(arr, arr.length);
	    System.out.println("The missing number is: " + missing);
		
		
	}

}
