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
    public boolean evaluateTree(TreeNode root) {

        // OR
        if(root.val == 2){
            return evaluateTree(root.right) || evaluateTree(root.left);
        }
        // AND
        else if(root.val == 3){
            return evaluateTree(root.right) && evaluateTree(root.left);
        }


        if(root.val == 0 || root.val == 1){
            return root.val == 0 ? false : true;
        }
        return false;
    }
}