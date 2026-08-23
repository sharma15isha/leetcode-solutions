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
    public int sumNumbers(TreeNode root) {
       return dfs(root, "");
    }
    public int dfs(TreeNode node, String path){
        if(node == null){
            return 0;
        }
        path=path+node.val;

        if(node.left == null && node.right == null){
            return Integer.parseInt(path);
        }
        return dfs(node.left,path) + dfs(node.right,path);
    }
}