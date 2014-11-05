package com.pattern.lly.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-4
 * Time: 下午4:18
 */
public class PS2 implements PS2Port {
    @Override
    public void workWithPS2() {
        System.out.println("This is ps2 work");
    }
}
