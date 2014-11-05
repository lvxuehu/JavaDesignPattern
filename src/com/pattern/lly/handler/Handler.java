package com.pattern.lly.handler;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-14
 * Time: 下午3:45
 */
public abstract class Handler {
    protected Handler successor=null;

    public Handler getSuccessor(){
         return  successor;
    }

    public void setSuccessor(Handler handler){
        this.successor=successor;
    }


    public abstract String handleFeeRequest(String user,double fee);
}
