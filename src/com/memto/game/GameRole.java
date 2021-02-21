package com.memto.game;

import lombok.Data;

@Data
public class GameRole {
    private int vit;
    private int def;
    //根據當前狀態創建 Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //從備忘錄對象，恢復GameRole的狀態
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //顯示當前遊戲角色的狀態
    public void display() {
        System.out.println("遊戲角色當前的攻擊力：" + this.vit + " 防禦力: " + this.def);
    }

}