package leetcode;

public class ReverseString {
    public String reverseString(String s) {
    	char[] result=s.toCharArray();
        for(int i=0;i<s.length()/2;i++){
        	char temp=result[i];
        	result[i]=result[result.length-1-i];
        	result[result.length-1-i]=temp;
        }
        return new String(result);
    }

}
//reverse the string