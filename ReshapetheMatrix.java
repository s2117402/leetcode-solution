package leetcode;

public class ReshapetheMatrix {
	public static void main(String[] args) {
		int[][] a={{1,2},{3,4}};
		System.out.println(matrixReshape(a, 1, 4)[0].length);

	}
	
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
    	int len=nums.length*nums[0].length;
    	int Pr=nums.length;
    	int Pc=nums[0].length;
		int[][] result=new int[r][c];
    	if(len!=r*c){
    		return nums;
    	}else{
    		for(int i=0;i<len;i++){
    			result[i/c][i%c]=nums[i/Pc][i%Pc];
    		}
    	}
    	return result;
        
    }

}
