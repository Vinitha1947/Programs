public class BinaryTreeIdentical {
    Node root;

    BinaryTreeIdentical() {
        root = null;
    }

    public boolean areIdentical(Node root1, Node root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 != null && root2 != null) {
            return (root1.data == root2.data &&
                    areIdentical(root1.left, root2.left) &&
                    areIdentical(root1.right, root2.right));
        }

        return false;
    }

    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        tree1.root = new Node(1);
        tree1.root.left = new Node(2);
        tree1.root.right = new Node(3);
        tree1.root.left.left = new Node(4);
        tree1.root.left.right = new Node(5);
        tree1.root.right.left = new Node(6);
        tree1.root.right.right = new Node(7);

        tree2.root = new Node(1);
        tree2.root.left = new Node(2);
        tree2.root.right = new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.right.left = new Node(6);
        tree2.root.right.right = new Node(7);

        if (tree1.areIdentical(tree1.root, tree2.root))
            System.out.println("The trees are identical.");
        else
            System.out.println("The trees are not identical.");
    }
}

