package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:10
 */
public abstract class AbstractMessage {
    MessageImplementor impl;

    protected AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }


    public void sendMessage(String msg,String toUser){
        impl.send(msg,toUser);
    }
}
