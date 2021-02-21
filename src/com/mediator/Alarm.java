package com.mediator;

// 具體同事類
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        // 在創造 Alarm 同事對象時，將自己放到 ConcreteMediator 對象中（集合）
        mediator.Register(name, this);
    }

    @Override
    public void SendMessage(int stateChange) {
        this.getMediator().GetMessage(stateChange, this.name);
    }

    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }


}