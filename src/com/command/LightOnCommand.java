package com.command;

public class LightOnCommand implements Command {
	// 聚合 reciver
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
    	// 調用 reciver 的方法
        light.on();
    }

    @Override
    public void undo() {
    	// 調用 reciver 的方法
        light.off();
    }
}
