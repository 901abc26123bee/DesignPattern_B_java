package com.visiter;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println(" 男人給的評價該歌手失敗 !");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println(" 女人給的評價該歌手失敗 !");
    }
}