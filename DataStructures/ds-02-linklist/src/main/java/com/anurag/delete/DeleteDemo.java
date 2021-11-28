package com.anurag.delete;

import com.anurag.length.LinkList;

public class DeleteDemo {
    public static void main(String[] args) {
        LinkList<Integer> linkList=new LinkList<>();
        linkList.insertAtEnd(23);
        linkList.insertAtEnd(33);
        linkList.insertAtEnd(11);
        linkList.insertAtEnd(55);
        linkList.insertAtEnd(66);

        System.out.println("before delete");
        linkList.printLinkList();

        linkList.delete(66);
        System.out.println("after delete");
        linkList.printLinkList();
    }
}
