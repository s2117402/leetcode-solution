package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
    	int min=Integer.MAX_VALUE;
    	List<String> result=new ArrayList();
        HashMap<String,Integer> list=new HashMap<>();
        HashMap<String,Integer> temp=new HashMap();
        for(int i=0;i<list2.length;i++){
        	list.put(list2[i], i);
        }
        for(int j=0;j<list1.length;j++){
        	if(list.containsKey(list1[j])){
        		temp.put(list1[j], list.get(list1[j])+j);
        		min=Math.min(min, list.get(list1[j])+j);
        	}
        }
        for(Map.Entry<String, Integer> thisentry:temp.entrySet()){
        	if(thisentry.getValue()==min){
        		result.add(thisentry.getKey());
        	}
        }
        return result.toArray(new String[result.size()]);
    }
}
//use hashmap  to get the same item and save the indexs in a new hashmap and save the
//minimum sum of two indexs.Finally get the value that their sum is equal to min
//return them