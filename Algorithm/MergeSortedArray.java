package Algorithms;


public class MergeSortedArray {

	public static void main(String[] Args) {
		
		int [] arr1 = new int[5]; 
		
		arr1[0]=1;arr1[1]=3;arr1[2]=5;arr1[3]=7;arr1[4]=9;
		
		int [] arr2 = new int[5];
		arr2[0]=2;arr2[1]=4;arr2[2]=6;arr2[3]=8;arr2[4]=10;
		
		int [] result = new int[arr1.length + arr2.length]; 
		
		System.out.println(result.length);
		
		int i = arr1.length - 1, j = arr2.length - 1, k = result.length;
		//O(n) Complexity
		while(k>0) {
			
			if(j < 0 || ((i >= 0) &&arr1[i] >= arr2[j])) {
				result[--k]=arr1[i--];
			}
			else {
				result[--k] = arr2[j--];
			}			
		}

	   /* while (k > 0)
	        result[--k] =
	                (j < 0 || (i >= 0 && arr1[i] >= arr2[j])) ? arr1[i--] : arr2[j--];*/
		
		for (int l = 0; l < result.length;l++) 
	         System.out.println("Element at index " + l +  
	                                      " is : "+ result[l]);
	}
}
