package com.pattern.lly.command;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-15
 * Time: 下午5:59
 */
public class Client {
    public static void main(String[] args) {
        MainBoardApi mainBoard =new GigaMainBoard();
        OpenCommand openCommand=new OpenCommand(mainBoard);
        Box box=new Box();
        box.setOpenCommand(openCommand);

        box.openButtonPressed();
    }
}
