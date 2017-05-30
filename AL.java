package leetcode;

public class AL {
	public static void main(String[] args) {
		System.out.println(count("AA"));
	}
	public static boolean count(String s){
		int Acount=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				Acount++;
			}else if(s.charAt(i)=='L'&&i>1){
				if(s.charAt(i-1)=='L'&&s.charAt(i-2)=='L'){
					return false;
				}
			}
			if(Acount>1){
				return false;
			}
		}
		return true;
	}

}
