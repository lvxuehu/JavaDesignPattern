package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:06
 */
public interface MessageImplementor {
    public void send(String msg,String toUser);
}
