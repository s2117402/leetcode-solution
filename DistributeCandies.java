package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DistributeCandies {
	public static void main(String[] args) {
		int[] a={1,1,2,2,3,3};
		System.out.println(distributeCandies(a));

	}
    public static int distributeCandies(int[] candies) {
    	HashSet<Integer> sister=new HashSet();
    	for(int i=0;i<candies.length;i++){
    		if(sister.size()<candies.length/2){
    			sister.add(candies[i]);
    		}
    	}
    	return sister.size();
        
    }

}
