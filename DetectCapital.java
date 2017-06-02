package leetcode;

import java.util.Arrays;

public class DetectCapital {
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("FlaG"));

	}
    public static boolean detectCapitalUse(String word) {
    	boolean firstUp=false;
    	boolean firstLow=false;
    	if(word.charAt(0)>='a'&&word.charAt(0)<='z'&&word.length()>1){
    		firstLow=true;
    	}else if(word.charAt(0)>='A'&&word.charAt(0)<='Z'&&word.length()>1){
    		firstUp=true;
    	}else{
    		return true;
    	}
        char[] words=Arrays.copyOfRange(word.toCharArray(), 1, word.length());
        System.out.println(words.length);
        for(int i=0;i<words.length;i++){
        	if(firstLow&&words[i]>='A'&&words[i]<='Z'){
        		return false;
        	}else if(firstUp&&i+1<words.length){
        		if((words[i]>='A'&&words[i]<='Z'&&words[i+1]>='a'&&words[i+1]<='z')
        				||(words[i]>='a'&&words[i]<='z'&&words[i+1]>='A'&&words[i+1]<='Z')){
        			return false;
        		}else{
        			continue;
        		}
        	}
        }
        return true;
    }
}
