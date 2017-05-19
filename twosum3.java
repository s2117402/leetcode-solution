package leetcode;

import java.util.HashMap;
import java.util.Map;

public class twosum3 {
	public static void main(String[] args){
		int given[]={2, 7, 11, 15};
		System.out.println(twoSum(given,11));
	}
	public static boolean twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				return true;
			}else{
				map.put(nums[i], i);
			}
		}
		return false;
        
    }
}

