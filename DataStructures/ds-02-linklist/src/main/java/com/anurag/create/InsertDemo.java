package com.anurag.create;

import static com.anurag.create.LinkList.Node;

public class InsertDemo {

    public static void main(String[] args) {

        LinkList linkList=new LinkList();
        linkList.head=null;
        Node first = new Node(12);
        Node second = new Node(15);
        Node third = new Node(18);

        linkList.head = first;
        first.next = second;
        second.next = third;
        third.next = null;

        linkList.printLinkList();
        System.out.println("-------");
        linkList.printLinkList();


    }

}
