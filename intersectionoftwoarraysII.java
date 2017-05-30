package leetcode;

import java.util.ArrayList;
import java.util.List;

public class intersectionoftwoarraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
		ArrayList<Integer> list=new ArrayList<>();
		List<Integer> numlist2=new ArrayList<>();
		for(int number:nums2){
			numlist2.add(number);
		}
		for(int i=0;i<nums1.length;i++){
			for(int j=0;j<numlist2.size();j++){
				if(nums1[i]==numlist2.get(j)){
					numlist2.remove(j);
					list.add(nums1[i]);
					break;
				}
			}
		}
		int[] result=new int[list.size()];
		for(int z=0;z<list.size();z++){
			result[z]=list.get(z);
		}
		return result;
    }

}
