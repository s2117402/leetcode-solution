package leetcode;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		int[] b={1,2,3};
        ArrayList<int[]> list=new ArrayList<int[]>();
        list.add(b);
        int a=list.size();
        System.out.println(a);
        System.out.println(list.get(0)[0]);
        list.clear();

		}
		
}
