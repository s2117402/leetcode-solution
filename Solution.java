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


//In this question,we use the property of map class to achive this,we all know in map class
//we all know map class is similar to array,it has index and value,and it has the containkey
//function as well,we can use this to search if this map has the number equal to target-num,
//if it's true,we just need to get the index,and output it(In this question,we use the key of
//map to store the value in array,and the value of the map to store the index of array)
