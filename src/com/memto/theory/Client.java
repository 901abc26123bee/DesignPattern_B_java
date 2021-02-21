package com.memto.theory;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("狀態#1 攻擊力 100");
        Caretaker caretaker = new Caretaker();
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 狀態#2 攻擊力 80 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 狀態#3 攻擊力 50 ");
        caretaker.add(originator.saveStateMemento());
        System.out.println("當前的狀態是 =" + originator.getState());

        //希望得到狀態 1, 將 originator 恢復到狀態1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("當前的狀態是 = " + originator.getState());

    }


}