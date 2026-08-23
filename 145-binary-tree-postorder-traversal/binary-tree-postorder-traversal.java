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
    public  List<Integer>  preOrder(TreeNode node, List<Integer> ans){
        if(node==null)return ans;
        
        ans = preOrder(node.left,ans);
        ans = preOrder(node.right,ans);
        ans.add(node.val);
        return ans;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        ans = preOrder(root,ans);
        return ans;
    }
}