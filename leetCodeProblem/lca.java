class lca {
    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    class Result {
        int depth;
        TreeNode lca;
        Result(int depth, TreeNode lca) {
            this.depth = depth;
            this.lca = lca;
        }
    }

    public TreeNode lcaDeepestLeave(TreeNode root) {
        return helper(root).lca;
    }

    private Result helper(TreeNode node) {
        if (node == null) {
            return new Result(0, null);
        }
        Result left = helper(node.left);
        Result right = helper(node.right);

        if (left.depth == right.depth) {
            return new Result(left.depth + 1, node);
        } else if (left.depth > right.depth) {
            return new Result(left.depth + 1, left.lca);
        } else {
            return new Result(right.depth + 1, right.lca);
        }
    }

    // Helper method to build a binary tree from an array
    public static TreeNode buildTree(Integer[] values) {
        if (values.length == 0 || values[0] == null) return null;

        TreeNode root = new TreeNode(values[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();
            if (values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            i++;
            if (i < values.length && values[i] != null) {
                current.right = new TreeNode(values[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        lca solution = new lca();
        Integer[] input = {3,5,1,6,2,0,8,null,null,7,4};
        TreeNode root = buildTree(input);
        TreeNode res = solution.lcaDeepestLeave(root);
        System.out.println("LCA of deepest leaves: " + res.val);  // Output should be 2
    }
}
