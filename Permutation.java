package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Permutation {
	static int start;
	static int end;
	public static void main(String[] args) {
		String sequence="54321";
		Permutation pt=new Permutation();
		int[] Sequence=pt.Str2intArr(sequence);
		if(pt.check(Sequence)){
			pt.findStart(Sequence);
			pt.findEnd(Sequence, start);
			int[] Seq=pt.swap(Sequence, start, end);
			pt.print(pt.sortAgain(Seq,start));
		}
		
	    }
	
	public int[] Str2intArr(String str){   //help us to tansform from Sring to int[]
		int[] num=new int[str.length()];
		for(int i=0;i<str.length();i++){
			num[i]=(int)(str.charAt(i)-48);
		}
		return num;
	}
	
	public boolean check(int[] sequence){      //check if this number is in the largest form,		                                       
		int temp=0;                             //if it is,output the number in inverted order
		for(int i=sequence.length-1;i>=0;i--){
			if(sequence[i]<temp){
				return true;
			}else{
				temp=sequence[i];
			}
		}
		System.out.println("This is the largest number!");
		for(int j=sequence.length-1;j>=0;j--){
			System.out.print(sequence[j]);
		}
		return false;
	}
	
	public void findStart(int[] sequence){    //Check each elements of this array backward,
		int temp=0;                           //find the first element is smaller than
		for(int i=sequence.length-1;i>=0;i--){ //next,return the index of this element
			if(sequence[i]<temp){
				start=i;
				break;
			}else{
				temp=sequence[i];
			}

		}
	
	}
	
	public void findEnd(int[] sequence,int start){  //Check each elements of this array backward,
		int temp=sequence[start];                   //find the least number is larger than the number
		for(int i=sequence.length-1;i>=0;i--){      //in sequence[start]
			if(sequence[i]>temp){
				end=i;
				break;
			}
		}
		
	}
	
	public int[] swap(int[] sequence,int start,int end){  //swap the value of start and end
		int temp=sequence[start];
		sequence[start]=sequence[end];
		sequence[end]=temp;
		return sequence;
	}
	
	
	public int[] sortAgain(int[] sequence,int start){
		Arrays.sort(sequence, start+1, sequence.length);	
        return sequence;
	}
	
	
	public void print(int[] sequence){
		for(int i=0;i<sequence.length;i++){
			System.out.print(sequence[i]);
		}
	}



}
