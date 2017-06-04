package leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
    	int j=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]!=0){
    			int temp=nums[j];
    			nums[j]=nums[i];
    			nums[i]=temp;
    			j++;
    		}
    	}
    }
}
//traversal this array,use j to represent how many non-0 numbers.when we find a 
//non-0 number,put it at the ahead of this array.