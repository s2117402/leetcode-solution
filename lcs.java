package leetcode;

public class lcs {
	public static void main(String[] args) {
		Lcs("abcvc","bcc");
		
	}
	public static void Lcs(String str1,String str2){
		int max;
		int mx[][]=new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<str1.length()+1;i++)
			mx[i][0]=0;
		for(int j=0;j<str2.length()+1;j++)
			mx[0][j]=0;
        for(int l=1;l<str1.length()+1;l++){
        	for(int k=1;k<str2.length()+1;k++){
        		if(str2.charAt(k-1)==str1.charAt(l-1)){
        			mx[l][k]=mx[l-1][k-1]+1;
        		}else{
        			max=Math.max(mx[l-1][k], mx[l][k-1]);
        			max=Math.max(max, mx[l-1][k-1]);
        			mx[l][k]=max;
        		}
        	}
    			
        }
        System.out.print("largest common subsequence:"+mx[str1.length()][str2.length()]);
		
	}


}
