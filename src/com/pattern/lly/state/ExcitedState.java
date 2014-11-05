package com.pattern.lly.state;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午5:38
 */
public class ExcitedState implements State {
    @Override
    public void fire() {
        System.out.printf("兴奋状态每秒开枪2次。");
    }
}
