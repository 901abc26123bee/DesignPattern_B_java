package com.memto.theory;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    //獲取到第index個Originator 的 備忘錄對象(即保存狀態)
    public Memento get(int index) {
        return mementoList.get(index);
    }

}