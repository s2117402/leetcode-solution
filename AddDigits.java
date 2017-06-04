package leetcode;

public class AddDigits {
	public static void main(String[] args) {
		System.out.println(addDigits(38));

	}
    public static int addDigits(int num) {
        if(num<10){
        	return num;
        }
        int result=0;
        while(num/10>0){
        	result+=num%10;
        	num=num/10;
        }
        result+=num;
        return addDigits(result);
    }
}
//use recursive way to resolve problem