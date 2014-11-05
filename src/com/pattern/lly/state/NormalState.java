package com.pattern.lly.state;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午5:37
 */
public class NormalState implements State {
    @Override
    public void fire() {
        System.out.printf("普通状态每秒开枪1次。");
    }
}
