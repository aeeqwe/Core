package proc.dds.binaryTreeLib;

import proc.dds.TreeNode;

public class BinaryTreeUtils_Test {
	
	  public static void main(String[] args) {
	        TreeNode ref = new TreeNode(
	                3,
	                new TreeNode(
	                        2,
	                        null,
	                        new TreeNode(5, null, null)),
	                new TreeNode(
	                        0,
	                        new TreeNode(0, null, null),
	                        new TreeNode(4, null, null)));

	       System.out.println(BinaryTreeUtils.size(ref));
	       System.out.println(BinaryTreeUtils.isSearchTree(ref));
	    		  
	    }

	    public static TreeNode _(int... values) {
	        int index = 0;
	        TreeNode tail = new TreeNode(values[index++], null, null);
	        TreeNode head = tail;
	        while (index < values.length) {
	            head.right = new TreeNode(values[index++], head, null);
	            head = head.right;
	        }
	        return tail;
	    }

	    public static String toString(TreeNode root) {
	        return (root == null) ? "()" : "(" + toString(root.left) + root.value + toString(root.right) + ")";
	    }

}
