package leetcode;

public class NextGreaterElementI {
	public static void main(String[] args) {
		int[] a={4,1,2};
		int[] b={1,3,4,2};
		System.out.println(nextGreaterElement(a, b)[1]);

	}
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
    	int[] result=new int[findNums.length];
    	for(int j=0;j<findNums.length;j++){
    		for(int k=getIndex(findNums[j],nums);k<nums.length;k++){
    			if(nums[k]>findNums[j]){
    				result[j]=nums[k];
    				break;
    			}else if(k==nums.length-1&&nums[k]<=findNums[j]){
    				result[j]=-1;
    			}
    		}
    		
    	}
    	return result;       
    }
    public static int getIndex(int num,int[] nums){
    	int count=0;
    	while(nums[count]!=num){
    		count++;
    	}
    	return count;
    }

}
//use getIndex to get current number's index in nums,then check if there is a number is larger
//than current number and it's at the right side of this number in nums,return its value,
//if there is no such a number,return -1