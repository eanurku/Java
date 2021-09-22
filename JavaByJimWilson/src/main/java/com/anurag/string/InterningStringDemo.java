package com.anurag.string;

public class InterningStringDemo {

    public static void main(String[] args) {
        //test 1
        String s1 = "i like java";
        String s2 = "i like java";


        System.out.println("s1 hascode=" + System.identityHashCode(s1));
        System.out.println("s2 hascode=" + System.identityHashCode(s2));
        //== check reference only
        if (s1 == s2) {
            System.out.println("reference comparision: s1==s2");

        }

        //test 2

        String s3 = "i ";
        s3 += "like java";
        String s4 = "i ";
        s4 += "like ";
        s4 += "java";
        System.out.println("s3 hascode=" + System.identityHashCode(s3));
        System.out.println("s4 hascode=" + System.identityHashCode(s4));
        //== check reference only
        if (s3 == s4) {
            System.out.println("s3==s4");
        }else{
            System.out.println("s3 != s4");
        }



        String s5 = s3.intern();
        String s6 = s4.intern();

        System.out.println("s5 hascode=" + System.identityHashCode(s5));
        System.out.println("s6 hascode=" + System.identityHashCode(s6));
        //== check reference only
        if (s5 == s6) {
            System.out.println("s5==s6");
        }
    }
}
