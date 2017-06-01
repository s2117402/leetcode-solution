package leetcode;

import java.util.Arrays;

public class SingleNumber {
	public static void main(String[] args) {
		int[] a={2,2,1};
		System.out.println(singleNumber(a));

	}
	 public static int singleNumber(int[] nums) {
	     Arrays.sort(nums);
	     for(int i=1;i<nums.length;i=i+2){
	    	 if(nums[i]!=nums[i-1]){
	    		 return nums[i-1];	    	

	    	 }
	     }
	     return nums[nums.length-1];
	 }
}
