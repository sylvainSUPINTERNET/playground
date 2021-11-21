// o(n)

// Input: root = [4,2,7,1,3,6,9]
// Output: [4,7,2,9,6,3,1]


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
    
    public TreeNode invertTree(TreeNode root) {      
        
        if ( root == null ) {
            return null;
        }
        
        TreeNode r = invertTree(root.right);
        TreeNode l = invertTree(root.left);
        
        root.right = l;
        root.left = r;
        
        return root;
    }
}
