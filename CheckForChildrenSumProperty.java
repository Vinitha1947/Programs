public class CheckForChildrenSumProperty {
    public static boolean isChildrenSumProperty(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) {
            return true;
        }

        int leftVal = (node.left != null) ? node.left.val : 0;
        int rightVal = (node.right != null) ? node.right.val : 0;

        if (node.val == leftVal + rightVal) {
            return isChildrenSumProperty(node.left) && isChildrenSumProperty(node.right);
        }

        return false;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(0);

        boolean result = isChildrenSumProperty(root);
        if (result) {
            System.out.println("The tree satisfies the Children Sum Property");
        } else {
            System.out.println("The tree does not satisfy the Children Sum Property");
        }
    }
}
