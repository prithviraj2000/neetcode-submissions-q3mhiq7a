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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> r = new ArrayList<>();
            int x=q.size();
            for(int i=0;i<x;i++){
                TreeNode top = q.poll();
                r.add(top.val);

                if(top.left!=null){
                    q.add(top.left);
                }
                if(top.right!=null){
                    q.add(top.right);
                }
            }
            res.add(r);
            
        }
        return res;

    }
}
