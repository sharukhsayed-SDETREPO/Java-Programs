package JavaPrograms;

public class SecondhighestinARRAY {

	 public static int findSecondHighest(int[] nums) {
	        if (nums == null || nums.length < 2) {
	            throw new IllegalArgumentException("Array must contain at least two elements");
	        }
	        
	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;
	        
	        for (int num : nums) {
	            if (num > max) {
	                secondMax = max;
	                max = num;
	            } else if (num > secondMax) {
	                secondMax = num;
	            }
	        }
	        System.out.println("maximum number is  "+ max);
	        return secondMax;
	    }

	    public static void main(String[] args) {
	        int[] nums = { 5, 3, 9, 1, 7, 4, 8,700 };
	        int secondHighest = findSecondHighest(nums);
	        System.out.println("Second highest number is: " + secondHighest);
	    }
}
