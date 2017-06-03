package leetcode;

import java.util.Arrays;

public class FindtheDifference {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "bafdc"));

	}
    public static char findTheDifference(String s, String t) {
    	char[] news=s.toCharArray();
    	char[] newt=t.toCharArray();
    	Arrays.sort(news);
    	Arrays.sort(newt);
        for(int i=0;i<s.length();i++){
        	if(news[i]!=newt[i]) return newt[i];
        }
        return newt[newt.length-1];
    }
}
//Use Arrays.sort to sort these two String,make them in prder again.Then compare
//each position between two string one by one until finding that different letter