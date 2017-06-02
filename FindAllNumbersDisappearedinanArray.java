package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	public static void main(String[] args) {
		int[] a={4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(a).contains(8));

	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> result=new ArrayList();
	        Arrays.sort(nums);
	        int last=0;
	        int next=nums.length;
	        for(int i=0;i<=nums.length;i++){
	        	if(i<nums.length){
	        		next=nums[i];
	        	}else{
	        		next=nums.length+1;
	        	}
	        	if(next-last>1){
	        		for(int j=last+1;j<next;j++){
	        			result.add(j);
	        		}
	        	}
	        	if(i<nums.length) last=nums[i];
	        }
	        return result;

	    }

}
//from start to end,when we find diffrence between last position and this position is larger
//than 1,then we add all these gap numbers into list.