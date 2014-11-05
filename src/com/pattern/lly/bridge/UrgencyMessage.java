package com.pattern.lly.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-5
 * Time: 下午2:13
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        String message="加急:"+msg;
        super.sendMessage(message, toUser);
    }


    public  Object watch(String msgId){
        return null;
    }
}
