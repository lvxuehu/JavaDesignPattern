package com.pattern.lly.adapter;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-4
 * Time: 下午4:11
 */
public class PS2ToUSB implements USBPort {
    private PS2Port ps2Port;

    public PS2ToUSB(PS2Port ps2Port) {
        this.ps2Port = ps2Port;
    }

    @Override
    public void workWithUSB() {
        ps2Port.workWithPS2();
    }
}
