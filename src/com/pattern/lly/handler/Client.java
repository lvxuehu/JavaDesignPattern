package com.pattern.lly.handler;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-14
 * Time: 下午3:58
 */
public class Client {
    public static void main(String[] args) {
        Handler h1=new GeneralManager();
        Handler h2=new DeptManager();
        Handler h3=new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String test1=h3.handleFeeRequest("a",2000);
        System.out.println("test1="+test1);

//        String test2=h3.handleFeeRequest("b",600);
//        System.out.println("test2 = " + test2);
//
//        String test3=h3.handleFeeRequest("c",30000);
//        System.out.println("test3 = " + test3);
    }
}
