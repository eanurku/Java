package com.anurag.insert;

public class InsertDemo {
    public static void main(String[] args) {

        LinkList<Integer> linkList1 = new LinkList<>();
        linkList1.insertAtStart(12);
        linkList1.insertAtStart(14);
        linkList1.insertAtStart(16);

        linkList1.printLinkList();
        System.out.println(" ,size=" + linkList1.length());

        LinkList<Integer> linkList2 = new LinkList<>();
        linkList2.insertAtEnd(12);
        linkList2.insertAtEnd(14);
        linkList2.insertAtEnd(16);

        linkList2.printLinkList();
        System.out.println(" ,size=" + linkList2.length());
    }
}
