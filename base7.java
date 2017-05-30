package leetcode;

import java.awt.image.ColorConvertOp;

public class base7 {
	public static void main(String[] args){
		System.out.println(convertToBase7(100));
	}
    public static String convertToBase7(int num) {
        int number=Math.abs(num);
        String sign=num>=0?"":"-";
        String result="";
        while(number/7>0){
        	result=number%7+result;
        	number=number/7;
        }
        return sign+number+result;
        
    }
}
