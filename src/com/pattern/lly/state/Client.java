package com.pattern.lly.state;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-16
 * Time: 下午5:40
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个机枪兵的实例：
        Marine marine = new Marine();
        // 调用fire()方法：
        marine.fire();
        // 设置为兴奋状态：
        marine.setMarine(new ExcitedState());
        // 再调用fire()方法：
        marine.fire();

    }
}
