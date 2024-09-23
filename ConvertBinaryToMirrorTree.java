public class ConvertBinaryToMirrorTree {
    Node root;

    ConvertBinaryToMirrorTree() {
        root = null;
    }

    void mirror(Node node) {
        if (node == null) {
            return;
        }

        mirror(node.left);
        mirror(node.right);

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    void inOrder(Node node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
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

        System.out.println("In-order traversal of the original tree:");
        tree.inOrder(tree.root);
        System.out.println();

        tree.mirror(tree.root);

        System.out.println("In-order traversal of the mirror tree:");
        tree.inOrder(tree.root);
    }
}
