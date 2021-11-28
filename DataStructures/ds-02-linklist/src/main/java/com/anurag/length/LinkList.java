package com.anurag.length;


public class LinkList<T> {
    private Node head;

    private class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtStart(T data) {
        Node tmpNode = new Node(data);
        tmpNode.next = head;
        head = tmpNode;
    }

    public void insertAtEnd(T data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node headRef = head;
        while (headRef.next != null) {
            headRef = headRef.next;
        }

        Node tmpNode = new Node(data);
        headRef.next = tmpNode;
    }

    public void delete(T key) {

        if(head==null){
            return ;
        }
        //if first element to be  deleted
        if(head.data.equals(key)){
            head=head.next;
        }

        Node prev=null;
        Node headRef=head;
        while(headRef !=null && !headRef.data.equals(key)){
            prev=headRef;
            headRef=headRef.next;
        }
        //no key found
        if(headRef==null){
            return ;
        }
        prev.next=headRef.next;

    }


    public void printLinkList() {

        Node headRef = this.head;
        while (headRef != null) {
            System.out.print(headRef.data);
            System.out.print(headRef.next != null ? " " : "");
            headRef = headRef.next;
        }
        System.out.println();

    }


    public int length() {
        int size = 0;
        Node headRef = this.head;
        while (headRef != null) {
            headRef = headRef.next;
            size++;
        }
        return size;
    }

    public int lengthR() {

        return this.getLengthRecursively(head);
    }

    private int getLengthRecursively(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + getLengthRecursively(head.next);
    }


}
