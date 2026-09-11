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
    public ArrayList<Integer> createStore(TreeNode root,ArrayList<Integer> store){
        if(root==null)return store;
        store = createStore(root.left,store);
        store.add(root.val);
        store = createStore(root.right,store);
        return store;
    }

    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> store = new ArrayList<Integer>();
        store = createStore(root,store);
        Map<Integer, Integer> prev = new HashMap<>();
        for (int i = 0; i < store.size(); i++) {
            int complement = k - store.get(i);
            if (prev.get(complement) != null) {
                return true;
            }
            prev.put(store.get(i), i);
        }
        return false;
    }
}