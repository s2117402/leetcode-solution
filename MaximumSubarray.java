package leetcode;

import java.util.Collections;

public class MaximumSubarray {
	public static void main(String[] args){
		int[] array={-2,1,-3,4,-1,2,1,-5,4};
		maxsub(array);
	}
	
	public static void maxsub(int[] arr){  //create a new array record[] to store the largest value case,
		int[] record=new int[arr.length]; //there are two possible at this element,is a new start
		int max=0;                        //or a part of the old contiguous array,we need compare
		record[0]=arr[0];                //which case has a larger value,then put that value in
		for(int i=1;i<arr.length;i++){   //the new array.Finally,we just need to pick the largest
			if(arr[i]>(arr[i]+record[i-1])){   //element in record[] ,that's the last element in
				record[i]=arr[i];             //the maximum subarray,the first element in this
				max=arr[i]>max?arr[i]:max;    //subarray,is the closest element that has
			}else{                           //same value in both two array.
				record[i]=arr[i]+record[i-1];
				max=(arr[i]+record[i-1])>max?(arr[i]+record[i-1]):max;
			}
		}
		System.out.println(max);
	}
}
