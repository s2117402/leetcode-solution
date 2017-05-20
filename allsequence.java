package leetcode;
import java.util.Arrays;

public class allsequence {
	static int start;
	static int end;
	static int count=0;
	public static void main(String[]arg){
		int n=4;
		int i=9;
		if(check(n,i)){
	        do_operation(returnArray(n), i);		

		}
	}
	
	
	public static void do_operation(int[] sequence,int i){
		findStart(sequence);
		findEnd(sequence, start);
		int[] Seq=sortAgain(swap(sequence, start, end), start);
		count=count+1;
		if(count==i){
			print(Seq);
		}else{
			do_operation(Seq, i);
		}
	}
	
	public static int[] returnArray(int n){ //inputs a number and returns an array based on the input
		int[] sequence=new int[n];
		for(int i=1;i<=n;i++)
			sequence[i-1]=i;
		return sequence;
	}
	
	public static boolean check(int n,int i){    //input validation
		if(n<2)
			return false;
		int range=1;
		for(int k=1;k<=n;k++){
			range=range*k;
		}
		
		if(i==0){
		print(returnArray(n));
		return false;
		}
		
		if(i>range-1){
			System.out.println("i is out of the range of n");
			return false;
		}
		return true;		
	}
	
	
	public static void findStart(int[] sequence){    //Check each elements of this array backward,
		int temp=sequence[sequence.length-1];                           //find the first element is smaller than
		for(int i=sequence.length-1;i>=0;i--){ //next,return the index of this element
			if(sequence[i]<temp){
				start=i;
				break;
			}else{
				temp=sequence[i];
			}

		}
	
	}
	
	public static void findEnd(int[] sequence,int start){  //Check each elements of this array backward,
		int temp=sequence[start];                   //find the least number is larger than the number
		for(int i=sequence.length-1;i>=0;i--){      //in sequence[start]
			if(sequence[i]>temp){
				end=i;
				break;
			}
		}
		
	}
	
	public static int[] swap(int[] sequence,int start,int end){  //swap the value of start and end
		int temp=sequence[start];
		sequence[start]=sequence[end];
		sequence[end]=temp;
		return sequence;
	}
	
	public static int[] sortAgain(int[] sequence,int start){
		Arrays.sort(sequence, start+1, sequence.length);	
        return sequence;
	}
	
	public static void print(int[] sequence){
		for(int i=0;i<sequence.length;i++){
			System.out.print(sequence[i]);
		}
	}
}
