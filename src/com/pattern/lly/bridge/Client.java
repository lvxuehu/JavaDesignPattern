package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:18
 */
public class Client {
    public static void main(String[] args) {
        MessageImplementor msg=new MessageSMS();
        AbstractMessage message=new CommonMessage(msg);
        message.sendMessage("加班申请","李总");

        msg=new MessageEmail();
        message=new UrgencyMessage(msg);

        message.sendMessage("加班申请—加急","李总");

    }
}
