package leetcode;

public class climbingstair {
	public static void main(String[] args) {
		int stairs=5;
		climb(stairs);
		
	}
	public static void climb(int stairs){   
		int[] num=new int[stairs+1];
		num[1]=1;
		num[2]=2;
		for(int i=3;i<=stairs;i++){
			num[i]=num[i-1]+num[i-2];
		}
		System.out.println(num[stairs]);
	}

}
// This is a fibonacci sequence problem basically;We use the dynamic programming method to
//resolve it;The basic ideal of this problem if we want to find the number of ways when stair
//number is n,we just need to get num[n-1]+num[n-2].This answer is based on the last choose you
//give,it can be one steps or two steps.Here we use dynamic programming to do it,save the number
//on a array,then we can use the number directly without recalculating it;