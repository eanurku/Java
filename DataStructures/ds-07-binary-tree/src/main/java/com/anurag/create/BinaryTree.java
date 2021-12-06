package com.anurag.create;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    static class Node<T> {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    public void inorderTraversal() {

        Node rootPointer = this.root;
        inorder(rootPointer);
    }

    private void inorder(Node rootPointer) {
        if (rootPointer != null) {
            inorder(rootPointer.left);
            System.out.println(rootPointer.data);
            inorder(rootPointer.right);
        }
    }

}
