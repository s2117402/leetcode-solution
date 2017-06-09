package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MajorityElement {
    public int majorityElement(int[] nums) {
    	int count=1;
    	int major=nums[0];
    	for(int i=1;i<nums.length;i++){
    		if(nums[i]==major){
    			count++;
    		}else if(count==0){
    			major=nums[i];
    		}else{
    			count--;
    		}
    	}
    	return major;
    }
}
//Since this array has a element's length is more than half of this length,we will find 
//the count of this element won't less than 1