package leetcode;

public class ConstructtheRectangle {
	public static void main(String[] args) {
		System.out.println(constructRectangle(4)[0]);

	}
    public static int[] constructRectangle(int area) {
    	int[] temp=new int[2];
    	temp[0]=Integer.MAX_VALUE;
        for(int i=area;i>=1;i--){
        	if(area%i==0&&Math.abs(area/i-i)<temp[0]){
        		temp[0]=Math.abs(area/i-i);
        		temp[1]=i;
        	}
        }
        temp[0]=Math.max(temp[1], area/temp[1]);
        temp[1]=Math.min(temp[1], area/temp[1]);
        return temp;
    }
}
//use temp array to save temporary data and final data.During the process,
//The first element of temp[] is used to save abs difference between W and L.
//The second element of temp[] is used to save either of W or L(the other can be got division)