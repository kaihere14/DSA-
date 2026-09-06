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
    int index;
    TreeNode node;
    public Tuple(TreeNode node, int index){
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if(root==null)return ans;
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().index;
            int first = 0 , last = 0 ;
            for(int i = 0 ; i < size ; i++){
                int curr_id = q.peek().index-min;
                TreeNode node = q.peek().node;
                q.poll();
                if(i==0)first = curr_id;
                if(i==size-1)last = curr_id;

                if(node.left!=null){
                    q.offer(new Tuple(node.left,2*curr_id+1));
                }
                if(node.right!=null){
                    q.offer(new Tuple(node.right,2*curr_id+2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}