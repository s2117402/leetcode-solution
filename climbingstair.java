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
