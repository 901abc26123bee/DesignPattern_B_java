package com.strategy;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public abstract class Duck {
	//屬性, 策略接口
    FlyBehavior flyBehavior;
    //其它屬性<->策略接口
    QuackBehavior quackBehavior;

    public abstract void display();//顯示鴨子信息

    public void quack() {
        System.out.println("鴨子嘎嘎叫~~");
    }

    public void swim() {
        System.out.println("鴨子會游泳~~");
    }

    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}