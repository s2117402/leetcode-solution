package leetcode;

public class ReverseWordsinaStringIII {
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));

	}
    public static String reverseWords(String s) {
        String[] words=s.split(" ");
        String result="";
        for(int i=0;i<words.length;i++){
        	result=result+reverse(words[i])+" ";
        }
        return result.trim();
    }
    
    public static String reverse(String word){
    	String result="";
    	for(int i=0;i<word.length();i++){
    		result=result+word.charAt(word.length()-1-i);
    	}
    	return result;
    }

}
//split the String with " " and put these words to a array,and reverse each word in 
//the array,then put them togather as a new String