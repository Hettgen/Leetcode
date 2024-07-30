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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> returnList = new ArrayList<Integer>();

        traverse(root, returnList);

        return returnList;

    }

    
    public static void traverse(TreeNode root, List<Integer> returnList){

        if(root == null){
            return;
        }
        
        returnList.add(root.val);

        traverse(root.left, returnList);
        traverse(root.right, returnList);

        

    }
}