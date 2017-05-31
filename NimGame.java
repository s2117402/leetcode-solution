package leetcode;

public class NimGame {
	public static void main(String[] args) {
		System.out.println(canWinNim(1));

	}
    public static boolean canWinNim(int n) {
        if(n%2==0){
        	return true;
        }
        if((n/2+(n%2>0?1:0))%2==0){
        	return true;
        }
        if((n/3+(n%3>0?1:0))%3==0){
        	return true;
        }
        return false;
    }

}
