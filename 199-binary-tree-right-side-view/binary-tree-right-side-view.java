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
    int vd;

    public Tuple(TreeNode node, int vd){
        this.node = node;
        this.vd = vd;
    }
}


class Solution {

    

    public ArrayList<Integer> rightSideView(TreeNode root) {

       ArrayList<Integer> ans = new ArrayList<Integer>();
       if(root==null)return ans;
       Queue<Tuple> q = new LinkedList<Tuple>();
       Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
       q.offer(new Tuple(root,0));
       
       while(!q.isEmpty()){
           Tuple temp = q.poll();
           TreeNode node = temp.node;
           int vd = temp.vd;
           map.put(vd,node.val);
           
           if(node.left != null)q.offer(new Tuple(node.left,vd+1));
           if(node.right != null)q.offer(new Tuple(node.right,vd+1));
           
       }
       for (Integer value : map.values()) {
           ans.add(value);
       }
       return ans;
    }
}