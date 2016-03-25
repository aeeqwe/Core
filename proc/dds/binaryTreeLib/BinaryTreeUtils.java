package proc.dds.binaryTreeLib;

import proc.dds.TreeNode;

public class BinaryTreeUtils {
	
	public static int size(TreeNode root) 
	{
		return (root == null) ? 0 : 1 + size(root.left) + size(root.right);
	}

    public static int height(TreeNode root) 
    {
    	if (root == null) return 0;
    	if (root.left == null && root.right == null) return 0;
    	return 1 + Math.max(height(root.left), height(root.right)) ;
    }

    public static int sum(TreeNode root)
    {
    	return (root == null) ? 0 : root.value + sum(root.left) + sum(root.right);
    }

    public static int max(TreeNode root) 
    {
    	return (root == null) ? 0 : Math.max(root.value, Math.max(max(root.left), max(root.right)));
    }
    
    public static int min(TreeNode root) 
    {
    	return (root == null) ? 0 : Math.min(root.value, Math.min(min(root.left), min(root.right)));
    }
    
    public static TreeNode add(TreeNode root, int value) {

        if (root == null)
            root = new TreeNode(value, null, null);

        if (value < root.value)
        {
            if (root.left != null)
            {
                add(root.left, value);
            }
            else
            {
                root.left = new TreeNode(value, null, null);
            }
        }
        else if (value > root.value)
        {
            if (root.right != null)
            {
                add(root.right, value);
            }
            else
            {
                root.right = new TreeNode(value, null, null);
            }
        }

        return root;

    }
    
    public static boolean isSearchTree(TreeNode root) {

        if (root == null)
            return true;


        /* false if the max of the left is > than us */
        if (root.left != null && max(root.left) > root.value)
            return false;


        /* false if the min of the right is <= than us */
        if (root.right != null && min(root.right) < root.value)
            return false;


        /* false if, recursively, the left or right is not a BST */
        if (!isSearchTree(root.left) || !isSearchTree(root.right))
            return false;

        /* passing all that, it's a BST */
        return true;


    }
    
    
//    private static int minValue(TreeNode root) {
//
//        int minValue = 0;
//
//        if(root.right == null) {
//            return root.value;
//        } else {
//            minValue = root.value;
//            minValue = Math.min(minValue, minValue(root.right));
//        }
//
//        return minValue;
//
//    }
//
//    private static int maxValue(TreeNode root) {
//        int maxValue = 0;
//
//        if(root.left == null) {
//            return root.value;
//        } else {
//            maxValue = root.value;
//            maxValue = Math.max(maxValue, maxValue(root.left));
//        }
//
//        return maxValue;
//    }
}
