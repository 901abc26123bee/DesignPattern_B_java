package com.state.money;

import lombok.Getter;

@Getter
public enum StateEnum {
    //訂單生成
    GENERATE(1,"GENERATE"),
    //已審核
    REVIEWED(2,"REVIEWED"),
    //已發布
    PUBLISHED(3,"PUBLISHED"),
    //待付款
    NOT_PAY(4,"NOT_PAY"),
    //已付款
    PAID(5,"PAID"),
    //已完結
    FEED_BACKED(6,"FEED_BACKED"),
    ;

    private int key;
    private String value;

    StateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

}
