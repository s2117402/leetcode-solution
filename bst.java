package leetcode;

public class bst {
	public static void main(String[] args){
		System.out.println(numTrees(5));
	}
	public static int numTrees(int n) {  
		if(n<=0)  
		    return 0;  
		int[] res = new int[n+1];  
		res[0] = 1;  
		res[1] = 1;  
		for(int i=2;i<=n;i++)  
		{  
		    for(int j=0;j<i;j++)  
		    {  
		        res[i] += res[j]*res[i-j-1];   //just choose a number as the root,
		    }                                  //get the record of 
		}                                     //the left side(numbers less than
		return res[n];                       //the root number) numbers and right
		}                  
}
