package leetcode;

public class TreeNodeSolution {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		      }
	public static void main(String[] args) {
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {
        
    }
    
    public TreeNode Dichotomy(int[] nums,int low,int high){
    	if(low>high){
    		return null;
    	}
    	int mid=(low+high)/2;
	   TreeNode node=new TreeNode(nums[mid]);
   }

}
