package com.mediator;

// 抽象同事
public abstract class Colleague {

	private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}
    
	public Mediator getMediator() {
		return this.mediator;
	}

    public abstract void SendMessage(int stateChange);
}