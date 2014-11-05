package com.pattern.lly.composite;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-7
 * Time: 下午4:19
 */
public class Leaf implements Component {
    @Override
    public void sampleOperation() {
        System.out.println("Leaf add");
    }
}
