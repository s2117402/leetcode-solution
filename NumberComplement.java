package leetcode;

public class NumberComplement {
	 public static void main(String[] args) {
		 System.out.println(findComplement(5));
	 }
	       
    public static int findComplement(int num) {
    	int count=0;
    	int result=0;
    	int number=num;
        while(number/2>0){
        	result=(int)Math.pow(2, count)+result;
        	count++;
        	number=number/2;
        }
    	result=(int)Math.pow(2, count)+result;
    	return result-num;
    }
}
//100110, its complement is 011001, the sum is 111111. 
//So we only need get the min number large or equal to num, then do substraction

