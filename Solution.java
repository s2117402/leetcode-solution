package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args){
		int given[]={2, 7, 11, 15};
		System.out.println(twoSum(given,13)[0]+" "+twoSum(given,13)[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(target-nums[i])){
				result[1]=i;
				result[0]=map.get(target-nums[i]);
			}else{
				map.put(nums[i], i);
			}
		}
		return result;
        
    }
}
