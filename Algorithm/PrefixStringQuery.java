package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrefixStringQuery {
	public static void main(String[] Args) {
		List<String> list1 = new ArrayList<>();		
		List<String> list2 = new ArrayList<>();
		List<Integer> result= new ArrayList<>();
		list1.add("steve");list1.add("VikashKumar");list1.add("steves");list1.add("stevens");list1.add("KumarVikash");
		
		list2.add("steve");list2.add("Vikash");list2.add("Kumar");list2.add("Kumari");
		int count1=0;
		for(String x : list2) { 			
			for(String y : list1) {
				if(y.contains(x)/*Check for continous string availablity*/ 
						&& (y.charAt(0) == x.charAt(0))/*For prefix checking*/ 
						&& y.length() > x.length()) {
					count1++;
				}
			}
			//if(count1 != 0) {
				result.add(count1);
				count1=0;
			//}
		}
		System.out.println(result);
	}

}
