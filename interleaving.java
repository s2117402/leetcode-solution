package leetcode;

public class interleaving{
	 public static void main(String[] args) {
		System.out.println(match("ghd","adhkjaghdh"));
	 }
	public static boolean match(String target,String vocublary){
		for(int j=0;j<(vocublary.length()-target.length());j++){		
			if((target.charAt(0)==vocublary.charAt(j))){
				for(int i=0;i<target.length();i++){
					if(target.charAt(i)!=vocublary.charAt(j+i)){
						break;
					}else if(i==target.length()-1){
						return true;
					}
				}
				
			}
		}
        return false;
	}
	
}