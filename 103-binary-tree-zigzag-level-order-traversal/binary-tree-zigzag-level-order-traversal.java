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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        if(root==null)return ans;
        boolean leftToRight = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int size = q.size();
            List<Integer> preAns = new LinkedList<Integer>();
            for(int i = 0 ; i < size ; i++){
                TreeNode temp = q.remove();
                if(temp.left!=null)q.add(temp.left);
                if(temp.right!=null)q.add(temp.right);
                if(leftToRight)preAns.add(temp.val);
                else{
                    preAns.add(0,temp.val);
                }
            }
            leftToRight = !leftToRight;
            ans.add(preAns);
        }
        return ans;
    }
}