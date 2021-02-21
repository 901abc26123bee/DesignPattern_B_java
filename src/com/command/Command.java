package com.command;

public interface Command {
    //執行動作(操作)
    public void execute();
    //撤銷動作(操作)
    public void undo();
}