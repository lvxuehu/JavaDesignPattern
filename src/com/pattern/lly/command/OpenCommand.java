package com.pattern.lly.command;

/**
 * Created with IntelliJ IDEA.
 * User: liliangyang
 * Date: 13-1-15
 * Time: 下午5:56
 */
public class OpenCommand implements Command {

    private MainBoardApi mainBoardApi=null;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        mainBoardApi.open();
    }
}
