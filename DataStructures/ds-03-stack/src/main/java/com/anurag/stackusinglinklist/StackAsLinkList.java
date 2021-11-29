package com.anurag.stackusinglinklist;

public class StackAsLinkList<T> {
    Node head;

    public void push(T data) {
        Node tmpNode = new Node(data);
        tmpNode.next = head;
        head = tmpNode;
    }

    public T pop() {
        T val = null;
        if (head == null) {
            return val;
        }
        val = head.data;
        head = head.next;
        return val;
    }

    public boolean isEmpty() {
        return head == null;
    }


    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }


}
