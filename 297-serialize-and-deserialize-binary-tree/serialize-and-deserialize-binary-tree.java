/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)return "";
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        StringBuilder sh = new StringBuilder("");
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp==null){
                sh.append("n ");
                continue;
            }
            sh.append(temp.val+" ");
            q.offer(temp.left);
            q.offer(temp.right);
        } 
        return sh.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println(data);
        if (data.isEmpty()) return null;
        String values[] = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);

        for (int i = 1; i < values.length; i++) {
            TreeNode temp = q.poll();

            if (!values[i].equals("n")) {
                temp.left = new TreeNode(Integer.parseInt(values[i]));
                q.offer(temp.left);
            }

            i++;

            if (i < values.length && !values[i].equals("n")) {
                temp.right = new TreeNode(Integer.parseInt(values[i]));
                q.offer(temp.right);
            }
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));