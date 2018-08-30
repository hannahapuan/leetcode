/**
95. Unique Binary Search Trees II

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> output = new ArrayList<TreeNode>();
        if(n <= 0){
            return output;
        }
        return generate(1,n);

    }
    
    public List<TreeNode> generate(int start, int end){
        // System.out.printf("generate(start=%d, end=%d) {\n", start, end);
        List<TreeNode> output = new ArrayList<TreeNode>();
        if(start > end){
            // System.out.println("add(null);\n}");
            output.add(null);
            return output;
        }
        for(int i = start; i <= end; i++){
            List<TreeNode> left = generate(start, i - 1);
            List<TreeNode> right = generate(i+1, end);
            for( TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    // System.out.printf("add(%d);\n}\n",root.val);
                    output.add(root);
                }
            }
        }
        return output;
    }
    
    
}