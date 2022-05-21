package Algorithms;

public class RemoveDuplicateSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {0,0,1,1,1,2,2,2,3,3,3};
		
		int index = 1;
		for(int i = 0; i < arr.length-1;i++) {
			if(arr[i] != arr[i + 1]) {
				arr[index++] = arr[i + 1];
			}
		}
		System.out.println("Array Length is : " + index);
		
		for(int j = 0; j< index;j++) {
			System.out.print(arr[j]);
		}

	}

}
