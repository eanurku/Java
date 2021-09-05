package com.anurag.LamdaExpression;


interface GreetingService{
    void sayhello(String s);
}

public class usingExternVariableInLambda {

    public   static String var ="monu";
    public static void main(String[] args) {


        GreetingService s1=message->{
            var="abc";
            System.out.println("anurag :"+message+var);
        };

        s1.sayhello("anu ");

    }
}
//output
//anurag :anu abc
