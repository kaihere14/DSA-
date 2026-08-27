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
        Deque<TreeNode> q = new ArrayDeque<>();
        List<Integer> ans = new LinkedList<Integer>();
        if(root==null)return ans;
        q.push(root);

        while(q.size()!=0){
            TreeNode curr = q.pop();
                if(curr.right!=null)q.push(curr.right);
                if(curr.left!=null)q.push(curr.left);
                ans.add(curr.val);
        }
        return ans;
    }
}