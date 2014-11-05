package com.pattern.lly.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午4:38
 */
public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }


    public double add(){
        iStrategy.add();
        return 0;
    }
}
