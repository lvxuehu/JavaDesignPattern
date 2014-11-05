package com.pattern.lly.command;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-15
 * Time: 下午5:58
 */
public class Box {

    private Command openCommand;

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }


    public void openButtonPressed(){
        openCommand.execute();
    }
}
