package egs.home20;

public class BinarySearchTree {
    private int size = 0;
    private Node root = null;


    int getSize() {
        return size;
    }

    public String put(Integer key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
            size++;
            return null;
        } else {
            return put(root, newNode);
        }
    }

    private String put(Node node, Node newNode) {
        if (newNode.key > node.key) {
            if (node.left != null) {
                return put(node.left, newNode);
            } else {
                node.left = newNode;
                size++;
                return null;
            }
        } else if (newNode.key < node.key) {
            if (node.right != null) {
                return put(node.right, newNode);
            } else {
                node.right = newNode;
                size++;
                return null;
            }
        } else {
            return node.value;
        }
    }

    static class Node {
        private Integer key;
        private String value;
        private Node left;
        private Node right;

        private Node(Integer key, String value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }
}
