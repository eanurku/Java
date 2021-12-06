package com.anurag.iscontinuous;

import static com.anurag.iscontinuous.BinaryTree.Node;

public class BinaryTreeContinuosDemo {
    public static void main(String[] args) {

        Node root = new Node(3);

        root.left = new Node(2);
        root.right = new Node(4);

        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right.right = new Node(5);

        BinaryTree btree=new BinaryTree(root);
        btree.inorderTraversal();
        System.out.println("-------------------------------------");
        System.out.println("is continuos btree="+btree.isContinosBinaryTree());

    }
}
