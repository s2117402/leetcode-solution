package leetcode;

import java.util.Collections;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args){
		int[] test={7,6,4,3,1};
		stock(test);
		
	}
	
	public static void stock(int[] arr){
		boolean flag=false;
		int[] optimal=new int[arr.length];
		optimal[0]=0;
		int max=0;
		if((optimal[1]=arr[1]-arr[0])>0){
			flag=true;
		}
		for(int i=2;i<arr.length;i++){
			if((arr[i]-arr[i-1])>(optimal[i-1]+arr[i]-arr[i-1])){
				optimal[i]=arr[i]-arr[i-1];
				if(optimal[i]>max){
					max=optimal[i];
				}
				if(optimal[i]>0){
					flag=true;
				}
			}else{
				optimal[i]=optimal[i-1]+arr[i]-arr[i-1];
				if(optimal[i]>0){
					flag=true;
				}
				if(optimal[i]>max){
					max=optimal[i];
				}
			}
		}
		
		if(flag==false){
			System.out.println("Output: 0");
		}else{
			System.out.println("Output: "+max);
		}
		
	}

}
