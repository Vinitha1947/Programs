public class BinarySearchTree {
    Node root;
    BinarySearchTree() {
        root = null;
    }

    Node findMin(Node node) {
        if (node == null)
            return null;

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(7);

        Node minNode = tree.findMin(tree.root);

        if (minNode != null) {
            System.out.println("Minimum value node in the BST is: " + minNode.data);
        } else {
            System.out.println("BST is empty.");
        }
    }
}
