package JavaPrograms;

public class ReverseWordsInaString {
	
	
	//using reusable methods
	public static String reverse(String rev) {
		int len=rev.length();
		String newrev="";
		for (int i=len-1;i>=0;i--) {
			newrev=newrev+rev.charAt(i);
		}
		
		return newrev;
		
	}
	
	
	public static String StrRevChar(String rev) {
		char []  newstr=rev.toCharArray();
String newop="";
		for (int j=newstr.length-1;j>=0;j--) {
			
			newop=newop+newstr[j];
		}
		return newop;
	
	}
	public static void main(String[] args) {
		
		System.out.println(reverse("Reverse USing for loop method "));
		System.out.println(StrRevChar("Reverse USing for xzczc method "));

		
		
		//using string  bulder
		
		String sb="This is String buiklder";
		
		StringBuilder sb1=new StringBuilder(sb);
		System.out.println(sb1.reverse());
		String s="Welcoome this is my String";
		//Approach 1 :using Split logic(same can be achieved by String builder for word reverse in 2 for loop)
		
		String split[]=s.split(" ");
		
		String reversewordedString="";
		for(String w:split) {
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);
			}
			
			reversewordedString=reversewordedString+reverseword+" ";
		}		
		System.out.println(reversewordedString);
		
	}

}
