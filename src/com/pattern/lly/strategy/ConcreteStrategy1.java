package com.pattern.lly.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午4:31
 */
public class ConcreteStrategy1 implements IStrategy {
    @Override
    public double add() {
        System.out.println(this.getClass().getName()+"'s add method");
        return 0;
    }
}
