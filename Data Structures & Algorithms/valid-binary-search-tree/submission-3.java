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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>lst = new ArrayList<>();
        preorder(root,lst);
        int prevVal = Integer.MIN_VALUE;
        for(int x : lst){
            if(x>prevVal){
                prevVal=x;
            } else{
                return false;
            }
        }
        return true;

        
    }
    void preorder(TreeNode root,ArrayList<Integer>lst) {
        if(root==null){
            return;
        }
        preorder(root.left,lst);
        lst.add(root.val);
        preorder(root.right,lst);
    }
}
