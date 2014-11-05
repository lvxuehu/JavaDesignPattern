package com.pattern.lly.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午4:39
 */
public class Clent {
    public static void main(String[] args) {
        IStrategy i1=new ConcreteStrategy1();
        IStrategy i2=new ConcreteStrategy2();

        Context context=new Context(i1);
        context.add();

        context=new Context(i2);
        context.add();
    }
}
