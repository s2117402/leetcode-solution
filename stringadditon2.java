package leetcode;

public class stringadditon2 {
	public static void main(String[] args) {
		System.out.println(addStrings("498828660196", "840477629533"));;
	}
    public static String addStrings(String num1, String num2) {
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

//do addition to each postion,and get a result,the answer length may be one position more
// than the largest length number,if that's true,the highest position must be 1,so we just
//need to make sure the highest position if it need to carry,if true,add a "1" before that 
answer
