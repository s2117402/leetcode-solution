package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class missingNumber {
	public static void main(String[] args) {
		int[] a={2,0};
		System.out.println(missingNumber(a));
		}
    public static int missingNumber(int[] nums) {
    	List<Integer> list=new ArrayList<>();
    	for(int x=0;x<nums.length;x++){
    		list.add(nums[x]);
    	}
        if(!list.contains(0)){
        	return 0;
        }else{
            for(int i=0;i<nums.length;i++){
                if(!list.contains(i)){
                    return i;
                }
            }
            return nums.length;
        }
    }
		
}
