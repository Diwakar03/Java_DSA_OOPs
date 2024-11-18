public class BinaryTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder traversal: root -> left -> right
        public static void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        // Inorder traversal: left -> root -> right
        public static void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }

        // Postorder traversal: left -> right -> root
        public static void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 4, 2, 3, -1, -1, 1, 2, -1, -1, 0, 8, 5, 3, -1, 2, 8, 9, -1, -1};

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        System.out.print("Preorder Traversal: ");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.print("Inorder Traversal: ");
        tree.inorderTraversal(root);
        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorderTraversal(root);
        System.out.println();
    }
}
