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
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> inorderResult = new ArrayList<Integer>();


        traverse(root, inorderResult);

        return inorderResult;

    }

    public static void traverse(TreeNode root, List<Integer> inorderResult){

        if(root == null){
            return;
        }

        traverse(root.left, inorderResult);

        inorderResult.add(root.val);

        traverse(root.right, inorderResult);


    }
    
}