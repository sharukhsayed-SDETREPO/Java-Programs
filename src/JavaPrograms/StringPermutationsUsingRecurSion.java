package JavaPrograms;

public class StringPermutationsUsingRecurSion {

	
	
	public static String swapString(String str,int i,int j) {
		char [] b=str.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		return String.valueOf(b);
		
	}
	   
	   public static void generatepermutations(String str, int start,int end) {
		   if(start==end-1) 
		   {System.out.println(str)
			   ;}
		   
		   else {
			   
			   for(int i=start;i<end;i++) {
				   
				   //fiix the literal character to a position in the string
				   str=swapString(str,start,i);
				   ///recursivesly call the function until the star and end-1 matches 
				   generatepermutations(str,start+1,end);
				   ///backtrack your literal's original position
				   str=swapString(str,start,i);
				   
			   }
		   }
	   }
	public static void main(String[] args) {
		String str="ABC";
		int len=str.length();
		
		
		generatepermutations(str,0,len);
		
		
		
				
	}

}
