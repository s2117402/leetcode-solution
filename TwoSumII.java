package leetcode;

public class TwoSumII {
	public static void main(String[] args) {
		int[] a={0,0,3,4};
		System.out.println(twoSum(a,0)[1]);

	}
    public static int[] twoSum(int[] numbers, int target) {
    	int[] result=new int[2];
    	int before=0;
    	int after=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
        	if(before<after&&numbers[before]+numbers[after]==target){
        		result[0]=before+1;
        		result[1]=after+1;
        	}else if(numbers[before]+numbers[after]!=target){
        		if(numbers[before]+numbers[after]>target) after--;
        		if(numbers[before]+numbers[after]<target) before++;
        	}
        }
		return result;
    }
}
//Because array is sorted.So we set two indexs,one traverse from left to right.the other
//from right to left.When sum of two elements is larger than target,then right index one 
//do one-position left move,if smaller than target,left index do one-position right move,
//until finding that is exactly the sum.