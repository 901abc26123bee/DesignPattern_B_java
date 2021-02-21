package com.prototype.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Monster {
    private Integer id = 10 ;
    private String nickname = "牛魔王";
    private String skill = "芭蕉扇";

    public Monster() {
        System.out.println("monster 創建..");
    }
}