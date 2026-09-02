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
class Tuple{
    TreeNode node;
    int level;

    public Tuple(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        int ans = -1;
       if(root==null)return ans;
       ans = root.val;
       Queue<Tuple> q = new LinkedList<Tuple>();
       q.offer(new Tuple(root,0));
       int last_level = 0;
       while(!q.isEmpty()){
           Tuple temp = q.poll(); 
           TreeNode node = temp.node;
           int level = temp.level;          
           if(node.left != null)q.offer(new Tuple(node.left,level+1));
           else if(level>last_level){
            ans = node.val;
            last_level = level;
           }
           if(node.right != null)q.offer(new Tuple(node.right,level+1));
       }
       return ans;
    }
}