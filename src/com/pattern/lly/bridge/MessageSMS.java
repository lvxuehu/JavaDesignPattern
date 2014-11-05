package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:07
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String msg, String toUser) {
        System.out.println("系统内短信方式发送，消息:" + msg+"给"+toUser);
    }
}
