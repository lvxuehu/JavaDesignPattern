package com.pattern.lly.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-4
 * Time: 下午4:17
 */
public class Test {
    public static void main(String[] args) {
        PS2 ps2=new PS2();
        USBPort usbPort=new PS2ToUSB(ps2);
        usbPort.workWithUSB();
    }
}
