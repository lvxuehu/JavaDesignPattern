package com.pattern.lly.handler;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-14
 * Time: 下午3:54
 */
public class DeptManager extends Handler {


    @Override
    public String handleFeeRequest(String user, double fee) {
        String str="";
        if (fee<1000){
            str="部门经理可以直接审核金额小于1000的申请";
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}
