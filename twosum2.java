package leetcode;

public class twosum2 {
	public static void main(String[] args){
		int[] test={2,7,11,15};
		System.out.println(twoSum(test, 9)[0]+" "+twoSum(test, 9)[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
		int[] high={nums.length-1,nums[nums.length-1]};
		int[] low={0,nums[0]};
		int[] result=new int[2];
		for(int i=0;i<nums.length;i++){
			if(low[1]+high[1]>target){
				high[0]=high[0]-1;
				high[1]=nums[high[0]];
			}else if(low[1]+high[1]<target){
				low[0]=low[0]+1;
				low[1]=nums[low[0]];
			}else{
				result[0]=low[0]+1;
				result[1]=high[0]+1;
				break;
			}
		}
		return result;
	}
}
//use two arrays,one search from left to right,the other from right to left.Each array's
//length is two since not only index but also value we need to save.if we find two values
//addition is larger to target,we will move right array one position left,then compare again
//until their addition is equal to target,return the index of two array.
