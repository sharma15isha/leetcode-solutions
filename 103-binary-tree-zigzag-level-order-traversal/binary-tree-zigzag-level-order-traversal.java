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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> level = new ArrayList<>();
    if(root == null){
        return level;
    }
    Queue<TreeNode>q=new LinkedList<>();
    q.offer(root);

    boolean leftright=true;
    while(!q.isEmpty()){
        int size=q.size();
         List<Integer>list=new ArrayList<>();
        for(int i=0;i<size;i++){
            TreeNode curr=q.poll();
        if(leftright){
            list.add(curr.val);
        }
        else{
            list.add(0,curr.val);
        }
        if(curr.left !=null){
            q.offer(curr.left);
        }
        if(curr.right !=null){
            q.offer(curr.right);
        }

        }
        level.add(list);
        leftright=!leftright;
        
    }
       return level;
      
    }
}