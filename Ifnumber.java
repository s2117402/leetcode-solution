package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ifnumber {
	public static void main(String[] args){
		String a=" 005047e+6 ";
		System.out.println(Ifnum(a));
	}
	
	public static boolean Ifnum(String s){
		s=s.trim();
        boolean num = false, numAfterE = true, dot = false, exp = false;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
            	num=true;
            	numAfterE=numAfterE||exp;
            	continue;
            }else if(s.charAt(i)=='+'||s.charAt(i)=='-'){
            	if(i>0&&(s.charAt(i-1)!='e'&&s.charAt(i-1)!='E')){
            		return false;
            	}
            	continue;
            }else if(s.charAt(i)=='.'){
            	if(dot==true||exp==true){
            		return false;
            	}
            	dot=true;
            	continue;
            }else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
            	if(exp||!num){
            		return false;
            	}
            	exp=true;
            	numAfterE=false;
            	continue;
            }else{
            	return false;
            }
        }
        return num&&numAfterE;
    } 
}

//Each position must respect to these four principles then we can say that's a number:
//1.    no special character besides +/-/./e/E/0-9
//2.   /e/E/. must be in the median of this number(not the first  or last position)
//3.   +/- must be in the first position or after E/e
//4.   . can't be put at the postion by E/e
