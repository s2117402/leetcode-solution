package leetcode;

import java.util.Collections;

public class MaximumSubarray {
	public static void main(String[] args){
		int[] array={-2,1,-3,4,-1,2,1,-5,10};
		maxsub(array);
	}
	public static void maxsub(int[] arr){
		int[] record=new int[arr.length];
		int start=0;
		int max=0;
		record[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>(arr[i]+record[i-1])){
				record[i]=arr[i];
				max=arr[i]>max?arr[i]:max;
			}else{
				record[i]=arr[i]+record[i-1];
				max=(arr[i]+record[i-1])>max?(arr[i]+record[i-1]):max;
			}
		}
		System.out.println(max);
	}
}
