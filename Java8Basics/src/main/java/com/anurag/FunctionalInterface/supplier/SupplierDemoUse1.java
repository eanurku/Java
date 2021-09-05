package com.anurag.FunctionalInterface.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemoUse1 {

    public static void main(String[] args) {

        Supplier<List<String>> list= ArrayList<String>::new;
        List<String> mylist = list.get();
        mylist.add("qw");
        mylist.add("er");
        System.out.println(mylist);



    }

}
