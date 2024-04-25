package JavaPrograms;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindtheDuplicatesInArray {

	public static void main(String[] args) {
          //1.Comparing one to all  --on^2 worst solution
		
		String [] str= {"Java","Char","Ruby","Python","VbScript","Java","Java","Char"};
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					
					System.out.println("Duplicate Found for :" + str[i]);
					
				}
			}
		}
		
		System.out.println("-----------------------------");
		//2.Using hashset :java collections o(n)--it only adds unique elemensts
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		for(String s:str) {
			if(lhs.add(s)==false) {
				System.out.println("Duplicate element is " + s);
			}
		}
		
		
		
		
		System.out.println("-----------+++++++-----------------");
		//3.using HashMap   
		Map<String,Integer> storemape=new HashMap<String, Integer>();
		for (String s:str) {
			Integer count =storemape.get(s);
			if(count==null) {
				storemape.put(s, 1);
			}
			else {storemape.put(s, ++count);};
				;
		}
		
		///this will print multiple fvalues with their number of occurences
		Set<Entry<String,Integer>> enp=storemape.entrySet();
		for(Entry <String,Integer> es:enp) {
			if(es.getValue()>1) {
				System.out.println("duplcaite elements are  " +es.getKey() +es.getValue());
			}
		}
		

	}

}
