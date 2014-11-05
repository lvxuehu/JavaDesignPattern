package com.pattern.lly.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-10
 * Time: 下午2:11
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("do some thing.......");
    }
}
