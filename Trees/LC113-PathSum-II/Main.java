import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int curr = 0;
        List<Integer> path = new ArrayList<>();
        helper(root, targetSum, curr, path);
        return ans;
    }

    void helper(TreeNode root, int targetSum, int curr, List<Integer> path) {
        if (root == null)
            return;
        List<Integer> currentPath = new ArrayList<>(path);
        currentPath.add(root.val);
        curr += root.val;
        if (root.left == null && root.right == null) {
            if (curr == targetSum) {
                ans.add(currentPath);
            }
            return;
        }
        helper(root.left, targetSum, curr, currentPath);
        helper(root.right, targetSum, curr, currentPath);
    }
}

public class Main {
    public static void main(String[] args) {
        // Constructing a sample binary tree:
        // 5
        // / \
        // 4 8
        // / / \
        // 11 13 4
        // / \ / \
        // 7 2 5 1
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        Solution sol = new Solution();
        List<List<Integer>> result = sol.pathSum(root, 22);

        System.out.println("Paths found: " + result);
    }
}