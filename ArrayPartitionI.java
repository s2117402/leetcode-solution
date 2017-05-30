package leetcode;

import java.util.Arrays;

public class ArrayPartitionI {
	 public int arrayPairSum(int[] nums) {
	     Arrays.sort(nums);
	     int i=0;
	     int result=0;
	     while(i<nums.length){
	    	 result=nums[i]+result;
	    	 i=i+2;
	     }
	     return result;
	 }

}
//The key of this question is try to put these numbers have similar value togather
//you can just sort them,and pick each two numbers as a pair from small to large.Then
//try to get the result