package egs.home19;

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
            Node current = root;
            while (true) {
                if (newNode.key > current.key) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = newNode;
                        size++;
                        return null;
                    }

                } else if (newNode.key < current.key) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = newNode;
                        size++;
                        return null;
                    }

                } else {
                    String temp = current.value;
                    current.value = newNode.value;
                    return temp;
                }
            }
        }
    }

   private Node getNode(Integer key) {
        Node current = root;
        while (current != null) {
            if (key == current.key) {
                return current;
            }
            if (key > current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return null;
    }

    public String get(Integer key) {
        Node node = getNode(key);
        if (node == null){
            return null;
        }
        return node.value;
    }

    void printTraversal() {
        Node current = root;
        Node current1 = root.right;
        while (current != null && current1 != null) {
            System.out.println(current.value);
            current = current.left;
            System.out.println(current1.value);
            current1 = current1.right;

        }
    }
//    public String remove(Integer key){
//        Node node = getNode(key);
//        if (node == null){
//            return  null;
//        }
//        String value = node.value;
//        if (node.left == null  && node.right == null){
//            node = null;
//            size--;
//            return value;
//        }
//        if (node.left != null && node.right == null){
//            node = node.left;
//            node.left = null;
//            return value;
//        }
//        if (node.left == null && node.right != null){
//            node = node.right;
//            node.right = null;
//            return value;
//        }
//        Node rightMin = node.right;
//        while (rightMin.left != null) {
//            rightMin = rightMin.left;
//        }
//        node.key = rightMin.key;
//        node.value = rightMin.value;
//        rightMin = null;
//
//        return value;
//        }

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