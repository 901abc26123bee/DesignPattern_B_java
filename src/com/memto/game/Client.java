package com.memto.game;

public class Client {

    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和boss大戰前的狀態");
        gameRole.display();

        //把當前狀態保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss大戰~~~");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();

        System.out.println("大戰後，使用備忘錄對象恢復到站前");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢復後的狀態");
        gameRole.display();
    }

}