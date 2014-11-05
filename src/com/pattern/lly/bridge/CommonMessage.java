package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:12
 */
public class CommonMessage extends AbstractMessage {

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        super.sendMessage(msg, toUser);
    }
}
