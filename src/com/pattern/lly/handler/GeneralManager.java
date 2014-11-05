package com.pattern.lly.handler;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-14
 * Time: 下午3:56
 */
public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";
        if(fee>=1000){
            str="总经理可以审核任何金额";
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}
