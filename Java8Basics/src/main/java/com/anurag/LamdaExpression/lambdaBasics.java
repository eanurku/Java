package com.anurag.LamdaExpression;


interface MathOPeration {
    int operation(int a, int b);
}

interface Greeting{

    void sayHello(String msg);
}

class test{

    public static int operate(int a,int b, MathOPeration op){
        return op.operation(a,b);
    }
    public static void  greetSomeone(String mesg,Greeting g){
        g.sayHello(mesg);
    }
}

public class lambdaBasics {


    public static void main(String[] args) {


        MathOPeration add = (int a, int b) -> a + b;

        MathOPeration multiply=(a,b)-> { return a*b;};

        MathOPeration conddiv=(a,b)->
        {
            if (a > 0 && b > 0) return a / b;
            else return -(a/b);
        };

        Greeting greet=message-> System.out.println("hello "+message);

        System.out.println("add:" +test.operate(2,3,add));
        System.out.println("add:" +test.operate(2,3,multiply));
        System.out.println("add:" +test.operate(-12,3,conddiv));

        test.greetSomeone("anurag",greet);

        greet.sayHello("hi bro");
        ;
    }

}
