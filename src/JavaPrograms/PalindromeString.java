package JavaPrograms;

public class PalindromeString {
public static void main(String [] args) {
	
	
	
	
	String rev="madam";
	int len=rev.length();
	String newrev="";
	for (int i=len-1;i>=0;i--) {
		newrev=newrev+rev.charAt(i);
	}
	
	System.out.println(newrev);
	
	if (newrev.equals(rev)) {
		System.out.println("palindrom");
	}
	
	else {
		System.out.println("not a palindrome");
	}
}
}
