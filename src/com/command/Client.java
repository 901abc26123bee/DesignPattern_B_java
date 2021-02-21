package com.command;

public class Client {
    public static void main(String[] args) {
        System.out.println("=========使用遙控器操作燈光==========");
        // 創建電燈的對象(接受者)
        LightReceiver lightReceiver = new LightReceiver();
        // 創建電燈相關的開關命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 需要一個遙控器
        RemoteController remoteController = new RemoteController();
        // 遙控器設置命令, 比如 no = 0 是light的開和關的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);
        remoteController.onButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

        System.out.println("=========使用遙控器操作電視機==========");
        TVReceiver tvReceiver = new TVReceiver();
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
        //給我們的遙控器設置命令, 比如 no = 1 是電視機的開和關的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();
        remoteController.undoButtonWasPushed();


    }


}