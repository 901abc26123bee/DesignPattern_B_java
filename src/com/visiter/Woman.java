package com.visiter;
/*
 * 1. 這裡使用到雙分派，首先在客戶端，將具體狀態（action）傳入 Woman 中（第一次分派）
 * 2. 然後 Woman 調用參數（action）中的具體方法 getWomanResult ，同時將自己(this)作為參數傳入（第二次分派）
 * */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}