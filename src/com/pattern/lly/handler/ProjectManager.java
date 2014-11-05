package com.pattern.lly.handler;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-14
 * Time: 下午3:48
 */
public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";

        if(fee<500){
            str="金额小于500，经理可以直接报销";
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }

        return str;
    }
}
