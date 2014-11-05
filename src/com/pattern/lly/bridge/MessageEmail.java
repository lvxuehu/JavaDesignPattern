package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:09
 */
public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String msg, String toUser) {
        System.out.println("使用Email方式发送消息 msg = [" + msg + "], toUser = [" + toUser + "]");
    }
}
