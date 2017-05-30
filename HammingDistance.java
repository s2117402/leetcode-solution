package leetcode;

public class HammingDistance {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }

}
//how many postions between this two numbers' binary forms are different,use XOR to set
//the position are different with the other 1 then use bitcount to get how many 1 this number
//has to get the result.
