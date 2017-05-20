package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

public class childrenhard {
	public static void main(String[] args){
		int[] test={7,3,2,1,8,4,2,1};
		System.out.println(leastcandy(test));

	}
	
	public static int leastcandy(int[] rating){
		int[] candy=new int[rating.length];
		int num;
		for(int i=0;i<rating.length;i++){
			candy[i]=1;
		}
		for(int i=1;i<rating.length;i++){
			if(rating[i]>rating[i-1]){
				candy[i]=candy[i-1]+1;
			}
		}
		num=candy[rating.length-1];
		for(int i=rating.length-2;i>=0;i--){
			if(rating[i]>rating[i+1]){
				candy[i]=candy[i+1]+1;
				num+=candy[i];
			}
		}
		return num;
		
	}

}
//At first of all,we set every kid get one candy since everyone must getting at least one candy
//then we search from left to right,if we find the right one rating value is better than left
//one,then give right kid one more candy than left kid.After this,we search from right to left
//if we find left kid has better rating value than right,then give one more candy to left kid
//than right kid.