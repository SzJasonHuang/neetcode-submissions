/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null){ 
            return root.val == targetSum;
        }
        return (
            pathSum(root.left, targetSum - root.val) || pathSum(root.right, targetSum - root.val));
    }

    public boolean pathSum(TreeNode n, Integer val) {
        if(n == null) return false;
        if (n.left == null && n.right == null) {
            if (val - n.val == 0)
                return true;
            else
                return false;
        }

        return (pathSum(n.left, val - n.val) || pathSum(n.right, val - n.val));
    }
}