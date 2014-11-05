package com.pattern.lly.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-10
 * Time: 下午2:19
 */
public class Clinet {
    public static void main(String[] args) {
        ConcreteComponent cc=new ConcreteComponent();
        ConcreteDecoratorA cda=new ConcreteDecoratorA(cc);
        ConcreteDecoratorB cdb=new ConcreteDecoratorB(cda);

        cdb.operation();
    }
}
