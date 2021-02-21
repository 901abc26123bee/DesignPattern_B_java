package com.command;

// 沒有任何命令，即空執行，：用於初始化每個按鈕，當調用空命令時，對象什麼都不做
// 這也是一種設計模式，可以省掉對空判斷
public class NoCommand implements Command {
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}