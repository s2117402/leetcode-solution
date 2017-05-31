package leetcode;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
	public static void main(String[] args) {
		String[] a={"cccd", "Alaska", "Dad", "Peace"};
		System.out.println(findWords(a)[0]);


	}
    public static String[] findWords(String[] words) {
        List<String> list=new ArrayList<>();
        for(String temp:words){
        	if(check(temp)){
        		list.add(temp);
        	}
        }
        String[] result=new String[list.size()];
        for(int i=0;i<list.size();i++){
        	result[i]=list.get(i);
        }
        return result;
    }
    public static boolean check(String word){
        String[] strs = {"QWERTYUIOPqwertyuiop","ASDFGHJKLasdfghjkl","ZXCVBNMzxcvbnm"};
        List<Character> row1=new ArrayList();
        List<Character> row2=new ArrayList();
        List<Character> row3=new ArrayList();
        for(char temp:strs[0].toCharArray()){
        	row1.add(temp);
        }
        for(char temp:strs[1].toCharArray()){
        	row2.add(temp);
        }
        for(char temp:strs[2].toCharArray()){
        	row3.add(temp);
        }
        if(row1.contains(word.charAt(0))){
        	for(int i=0;i<word.length();i++){
        		if(!row1.contains(word.charAt(i))){
        			return false;
        		}
        	}
        	
        }else  if(row2.contains(word.charAt(0))){
        	for(int i=0;i<word.length();i++){
        		if(!row2.contains(word.charAt(i))){
        			return false;
        		}
        	}
        	
        }else  if(row3.contains(word.charAt(0))){
        	for(int i=0;i<word.length();i++){
        		if(!row3.contains(word.charAt(i))){
        			return false;
        		}
        	}
        	
        }
        return true;
    }

}
//use the property of list to see if one of three lists contains all letters of this word,
//if it's true,return true,then add this word to a new list,finally,transform this list'
//to a array,and return this new String array