package leetcode;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }

}
//use recursive way ro resolve,it will implement itself until find a null root,and return
//the max depth
