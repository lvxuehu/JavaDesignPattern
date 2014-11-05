package com.pattern.lly.watch;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午3:30
 */
public class ConcreteWatcher implements AbstractWatcher {
    @Override
    public void update() {
        System.out.println("update ......");
    }
}
