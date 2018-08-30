/**
94. Binary Tree Inorder Traversal
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      if(root == null)
          return null;
        Stack<TreeNode> s = new Stack<TreeNode>();
    List<TreeNode> output = new ArrayList<TreeNode>();
    TreeNode current = root;
    
    while(s.size() > 0 || current != null){
        if(current != null){
            s.push(current);
            current = current.left;
        }else{
            TreeNode temp = s.pop();
            output.add(temp);
            current = temp.right;
        }
    }
        return output;
    }
    
}
