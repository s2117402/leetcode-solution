package leetcode;

public class justification {
	public static void main(String[] args) {
		String[] input={"This","is","an","example","of","text","justification."};
		int limit=16;
		int[] len=eachLen(input);
		if(check(len,limit)){
			new justification();
			justification.adapter(input, len, limit, 0, false);
		}
	}

	public static int[] eachLen(String[] input){    //return a array include the lengths
		int[] len=new int[input.length];            //of each element in input[]
		for(int i=0;i<input.length;i++)
			len[i]=input[i].length();
		return len;
	}
	
	public static boolean check(int[] len,int limit){  //check the maxmiam length of each
		for(int temp:len){                             //line should be larger or equal the
			if(temp>limit){                            //largest length in input[]
				System.out.println("The length of each line should be longer or equal than"+temp);
				return false;
			}
		}
		return true;
	}
	//stopflag is used to if this is the last line;start is where we start in input[] or eachlen[]
	//this time
	public static void adapter(String[] input,int[] eachlen,int limit,int start,boolean stopflag){
		if(stopflag==false){
			int num1=(limit+1)/2;
			int num2=eachlen.length-start;    //此处已考虑最后一行情况
			int wordnum=1;                    //wordnum is used to save words will be put in 
			int spaceleft=limit;              //this line,is initialized as 1
			if(num1<num2){                    //in this case,the rest String is enough for us to
				int num=0;                    //use,we extremely assume each String is only one
				for(int i=0;i<num1;i++){      //letter
					num=num+eachlen[i+start];
					if(num+i>limit){
						wordnum=i;
						break;
					}
					spaceleft=spaceleft-eachlen[i+start];   //how many rest spaces in this line 
				}
			}else{                          //In this case,num1>=num2 means here are no enough
				int num=0;                   //Strings we can use to fit our assumption,the most 
				for(int i=0;i<num2;i++){     //extreme case is we put all the rest String on
					num=num+eachlen[i+start];// this line
					if(num+i>limit){
						wordnum=i;
						break;
					}
					spaceleft=spaceleft-eachlen[i+start];
					if(i==num2-1){          //when this loop finished,we have put all rest Strings
						stopflag=true;     //in this line,there is no more String we can add.i       
					}                      //that means we have processed all string,it's time to stop
				}	
			}
			
			int gapN=wordnum-1;            //gapN means the gap between two words
			int[] gap=new int[gapN];       //we use gap[] to save how many spaces each gap has.
			if(gapN>0){                    //assign spaces to the gaps.
				for(int j=0;j<gapN;j++){
					if(j==0){
						gap[j]=spaceleft/gapN+spaceleft%gapN; //if the number of spaces can't
					}else{                                        //be divided exactly to the number
					gap[j]=spaceleft/gapN; 
					}                                       //of gaps,assign the remainder spaces
				}                                           //to the first element in gap[]
			}
			print(input,start,gapN,gap);
			start=start+wordnum;
			adapter(input,eachlen,limit,start,stopflag);
		}		
	}
	
	public static void print(String[] input,int start,int gapN,int[] gap){
		if(gapN>0){
			System.out.print("\n");
			for(int i=0;i<gapN;i++){
				System.out.print(input[i+start]);
				for(int j=0;j<gap[i];j++){
					System.out.print(" ");
				}
				if(i==gapN-1){
					System.out.print(input[i+start+1]);
					break;
				}
			}
			
		}
		if(gapN==0){
			System.out.print("\n"+input[start]);
		}
		
	}

}
