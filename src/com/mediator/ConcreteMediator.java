package com.mediator;

import java.util.HashMap;

public class ConcreteMediator extends Mediator {
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    @Override
    // 具體仲介者的核心方法
    // 1.得到具體方法，完成對應任務
    // 2.仲介者在這個方法，協調各個具體同事對象，完成任務
    public void GetMessage(int stateChange, String colleagueName) {
        //處理鬧鐘發出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
            } else if (stateChange == 1) {
                ((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
            }

        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {//如果TV發現消息

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗簾發出的消息，這里處理...
        }
    }

    @Override
    public void SendMessage() {

    }
}