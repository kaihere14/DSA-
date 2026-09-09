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
    public ArrayList<Integer> getArray(TreeNode root , ArrayList<Integer> values){
        if(root==null)return values;
        values.add(root.val);
        values = getArray(root.left,values);
        values = getArray(root.right,values);
        return values;
    }
    public void flatten(TreeNode root) {
        if(root==null)return;
        ArrayList<Integer> values = new ArrayList<Integer>();
        values = getArray(root,values);
        TreeNode temp = root;
        for(int i = 1 ; i <  values.size() ; i++ ){
            temp.left = null;
            temp.right = new TreeNode(values.get(i));
            temp = temp.right;
        }
    }
}