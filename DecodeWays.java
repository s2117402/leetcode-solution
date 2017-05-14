package leetcode;

public class DecodeWays {
	public static void main(String[] args) {
		//The Sring length must larger or equal to 3,and no 0 in the String.

	    String input="1234";
	    check(input);
	    }
	public static void check(String input){
		int Fnm2=1;
		int Fnm1=0;
		if(((int)(input.charAt(0)-'0')*10+(int)(input.charAt(1)-'0'))<=26){
			Fnm1=2;
		}else{
			Fnm1=1;
		}
		int i=0;
		for(i=2;i<input.length();i++){
			if(((int)(input.charAt(i-1)-'0')*10+(int)(input.charAt(i)-'0'))<=26){
				Fnm1=Fnm1+Fnm2;
				Fnm2=Fnm1-Fnm2;
			}else{
				Fnm2=Fnm1;
			}

		}
		System.out.println(Fnm1);
		
	}

}
