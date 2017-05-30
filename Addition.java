package leetcode;

public class Addition {
    public String addStrings(String num1, String num2) {
    	String longer=num1.length()>=num2.length()?num1:num2;
    	String shorter=num1.length()<num2.length()?num1:num2;
    	char[] result=new char[longer.length()];
    	int difference=longer.length()-shorter.length();
    	int count=0;
    	int lastPosition=0;
    	for(int i=shorter.length()-1;i>=0;i--){
    		result[i+difference]=(char) (((shorter.charAt(i)-'0')+(longer.charAt(i+difference)-'0')+lastPosition)%10+'0');
    		lastPosition=(((shorter.charAt(i)-'0')+(longer.charAt(i+difference)-'0')+lastPosition)/10);
    		count++;
    	}
    	for(int j=longer.length()-count-1;j>=0;j--){
    		result[j]=(char) ((longer.charAt(j)-'0'+lastPosition)%10+'0');
    		lastPosition=(char) ((longer.charAt(j)-'0'+lastPosition)/10);
    		count++;
    	}
    	if(lastPosition==1){
    		return "1"+new String(result);
    	} else{
    		return new String(result);
    	}
    }
}
//design addition algorithm myself.