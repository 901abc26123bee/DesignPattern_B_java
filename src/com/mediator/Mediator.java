package com.mediator;

public abstract class Mediator {
    // 將給中介者對象，加入到集合中
    public abstract void Register(String colleagueName, Colleague colleague);

    // 接收消息, 具體的同事對象發出
    public abstract void GetMessage(int stateChange, String colleagueName);

    public abstract void SendMessage();
}