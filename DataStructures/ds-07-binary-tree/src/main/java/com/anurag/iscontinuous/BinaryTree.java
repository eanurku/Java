package com.anurag.iscontinuous;

public class BinaryTree {
    Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public boolean isContinosBinaryTree() {


        return isContinuos(this.root);
    }

    private boolean isContinuos(Node root) {

        if (root == null || isLeafNode(root)) {
            return true;
        }
        boolean isleftContinuos = true;
        boolean isRightContinuos = true;
        if (root.left != null) {
            isleftContinuos = Math.abs(root.data - root.left.data) == 1;
        }
        if (root.right != null) {
            isRightContinuos = Math.abs(root.data - root.right.data) == 1;
        }

        boolean currentResult;
        return isContinuos(root.left) &&
                isContinuos(root.right) && isleftContinuos && isRightContinuos;
    }

    private boolean isLeafNode(Node root) {

        return root != null && root.left == null && root.right == null;
    }

    static class Node<T extends Integer> {
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
        inorder(this.root);
    }

    private void inorder(Node rootPointer) {

        if (rootPointer != null) {
            inorder(rootPointer.left);
            System.out.print(rootPointer.data + " ");
            inorder(rootPointer.right);
        }
    }
}
