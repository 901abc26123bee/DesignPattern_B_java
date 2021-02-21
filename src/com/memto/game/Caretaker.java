package com.memto.game;

public class Caretaker {

    //如果只保存一次狀態
    private Memento memento;
    //對GameRole 保存多次狀態
    //private ArrayList<Memento> mementos;
    //對多個遊戲角色保存多個狀態
    //private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}