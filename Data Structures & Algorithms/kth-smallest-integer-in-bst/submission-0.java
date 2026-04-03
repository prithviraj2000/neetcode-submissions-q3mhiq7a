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
    ArrayList<Integer>a = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
       
        solve(root);
        return a.get(k-1);
    }
    void solve(TreeNode root){
        if(root==null){
            return;
        }
        solve(root.left);
        a.add(root.val);
        solve(root.right);
    }
}
