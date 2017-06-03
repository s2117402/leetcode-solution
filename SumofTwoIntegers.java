package leetcode;

public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        if(b==0){
        	return a;
        }
        int sum=a^b;
        int carry=(a&b)<<1;
        return getSum(sum,carry);
    }
}
//http://www.cnblogs.com/kiven-code/archive/2012/09/15/2686922.html
//This is the link of how our computer process addition(binary)
//we use the same ideal