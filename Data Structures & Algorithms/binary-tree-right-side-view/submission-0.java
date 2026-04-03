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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        List<Integer>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            int x = q.size();
            for(int i=0;i<x;i++){
                TreeNode t = q.poll();
                if(i==x-1){
                    ans.add(t.val);
                }
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
            }
        }
        return ans;
    }
}
