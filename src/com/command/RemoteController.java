package com.command;

public class RemoteController {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    // 完成按鈕初始化
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++ ) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    // 給我們的按鈕設置你需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }


    // 按下開按鈕
    public void onButtonWasPushed(int no) { // no 0
    	// 找到你按下的按鈕，並調用對應方法
        onCommands[no].execute();
        // 記錄這次的操作，用於撤銷
        undoCommand = onCommands[no];
    }

    // 按下關按鈕
    public void offButtonWasPushed(int no) { // no 0
    	// 找到你按下的按鈕，並調用對應方法
        offCommands[no].execute();
     // 記錄這次的操作，用於撤銷
        undoCommand = offCommands[no];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

}
