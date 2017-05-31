package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
    public List<String> fizzBuzz(int n) {
    	List<String> result=new ArrayList();
        for(int i=1;i<=n;i++){
        	if(i%3==0&&i%5==0){
        		result.add("FizzBuzz");
        	}else if(i%3==0&&i%5!=0){
        		result.add("Fizz");
        	}else if(i%5==0&&i%3!=0){
        		result.add("Buzz");
        	}else{
        		result.add(""+i);
        	}
        }
        return result;
    }

}
//when it meets i%3==0&&i%5==0,return fizzbuzz,
//when it meets i%3==0&&i%5!=0,return fizz,
//when it meets i%5==0&&i%3!=0,return buzz