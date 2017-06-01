package leetcode;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] a={1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(a));

	}
    public static int findMaxConsecutiveOnes(int[] nums) {
    	int max=0;
    	int count=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]==1){
        		count++;
        	}else{
        		max=Math.max(max, count);
        		count=0;
        	}
        }
		max=Math.max(max, count);
		return max;
    }

}
//In this array,when we find a 1,count it.when we find a 0,set the count to 0,and
//go to check if last count is maximum,if it's true,set the count as max;Finally,
//we must to avoid the situation that last number is 1,how do we resolve it is 
//check the count with max again.