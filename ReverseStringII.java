package leetcode;

public class ReverseStringII {
	public static void main(String[] args) {
		System.out.println(reverseStr("abcdef", 2));
	}
    public static String reverseStr(String s, int k) {
    	char[] result=s.toCharArray();
    	int TotalRounds=s.length()%(2*k)>0?s.length()/(2*k)+1:s.length()/(2*k);
    	int lastposition;
    	int firstposition;
    	for(int NowRound=0;NowRound<TotalRounds;NowRound++){
    		lastposition=NowRound*2*k+k-1;
    		firstposition=NowRound*2*k;
    		if(lastposition>s.length()-1){
    			lastposition=s.length()-1;
    		}
			for(int z=0;z<(lastposition-firstposition+1)/2;z++){
				char temp=result[firstposition+z];
				result[firstposition+z]=result[lastposition-z];
				result[lastposition-z]=temp;
    		}
    	}
    	return new String(result);
    }
}
