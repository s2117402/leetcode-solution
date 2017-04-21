package leetcode;
//Get Substring with KMP
public class SubStr {
	 public static void main(String[] args) {
		 new SubStr().strStr("abdfcgabcabc", "abc");
	        
	    }
    public void strStr(String haystack,String needle){
    	int times=haystack.length()+1-needle.length();//how many positions the needled need to move at most
    	for(int i=0;i<times;i++){
    		for(int j=0;j<needle.length();j++){
    			if(needle.charAt(j)!=haystack.charAt(i+j)){
    				break;               //if here is one position can't match,we don't need to check the following position.
    			}
    			if(j==needle.length()-1){
    				System.out.println("SubString detected!It starts at:"+i);
    				return;
    			}
    		}
    		if(i==times-1){
    			System.out.println("Don't find it!");
    		}
    	}
    	
    }
}
