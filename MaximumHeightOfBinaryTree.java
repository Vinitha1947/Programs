public class MaximumHeightOfBinaryTree {
    Node root;

    MaximumHeightOfBinaryTree() {
        root = null;
    }

    int maxDepth(Node node) {
        if (node == null)
            return 0;
        else {
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            if (leftDepth > rightDepth)
                return (leftDepth + 1);
            else
                return (rightDepth + 1);
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);

        System.out.println("The maximum depth of the binary tree is: " + tree.maxDepth(tree.root));
    }
}
