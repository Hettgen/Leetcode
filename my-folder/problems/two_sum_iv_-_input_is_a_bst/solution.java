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
    public boolean findTarget(TreeNode root, int k) {
        
        ArrayList<Integer> treeList = new ArrayList<Integer>();

        depthFirstSearch(root, treeList);
        int listSize = treeList.size();
        

        for(int i = 0; i < listSize;){

            int value = treeList.get(i) + treeList.get(listSize - 1);
            if(listSize - i<= 1){
            return false;
            }
            if(value == k){
                return true;
            }
            if(value > k){
                listSize--;
            }
            else{
                i++;
            }
        }
        return false;

    }

    public static void depthFirstSearch(TreeNode root, ArrayList treeList){
        if(root == null){
            return;
        }
            depthFirstSearch(root.left, treeList);
        
            treeList.add(root.val);

            depthFirstSearch(root.right, treeList);

    }


    
    

}