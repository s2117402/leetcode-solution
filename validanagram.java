package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class validanagram {
	 public static void main(String[] args) {
		 isAnagram(" ", " ");
	        
	    }
    public static void isAnagram(String s, String t) {
        	Set<Character> s1=new HashSet<>();
        	Set<Character> t1=new HashSet<>();
        	s1.add('c');
        	s1.add('b');
        	s1.add('a');
        	t1.add('a');
        	t1.add('b');
        	t1.add('a');
        	s1.forEach(num->System.out.println(num));
        	t1.forEach(num->System.out.println(num));
        	System.out.println(s1.hashCode()==t1.hashCode());

    }

}
