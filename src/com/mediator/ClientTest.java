package com.mediator;

/**
 * 中介者 設計模式
 */
public class ClientTest {
    public static void main(String[] args) {
    	// create a 仲介者
        Mediator mediator = new ConcreteMediator();
        // 創建 Alarm 的同時加入到 ConcreteMediator 對象中的 HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        // 創建 CoffeeMachine 的同時加入到 ConcreteMediator 對象中的 HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
        // 創建 curtains 的同時加入到 ConcreteMediator 對象中的 HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        // 創建 tv 的同時加入到 ConcreteMediator 對象中的 HashMap
        TV tV = new TV(mediator, "TV");

        // 讓鬧鐘發出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);

    }
}