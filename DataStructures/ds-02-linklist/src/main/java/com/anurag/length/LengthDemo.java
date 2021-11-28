package com.anurag.length;

public class LengthDemo {
    public static void main(String[] args) {
        LinkList<Integer> linkList=new LinkList<>();
        linkList.insertAtEnd(23);
        linkList.insertAtEnd(33);
        linkList.insertAtEnd(11);
        linkList.insertAtEnd(55);

        linkList.printLinkList();
        System.out.println();
        System.out.println("size="+linkList.length());
        System.out.println("size="+linkList.lengthR());

    }
}
