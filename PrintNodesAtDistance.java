public class PrintNodesAtDistance {
    Node root;

    PrintNodesAtDistance() {
        root = null;
    }

    void printNodesAtDistance(Node node, int k) {
        if (node == null) {
            return;
        }
        if (k == 0) {
            System.out.print(node.data + " ");
            return;
        } else {
            printNodesAtDistance(node.left, k - 1);
            printNodesAtDistance(node.right, k - 1);
        }
    }

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

        int k = 2;
        System.out.println("Nodes at distance " + k + " from root:");
        tree.printNodesAtDistance(tree.root, k);
    }
}
