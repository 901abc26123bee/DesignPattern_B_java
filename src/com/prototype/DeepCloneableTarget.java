package com.prototype;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable , Serializable {

	private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //構造器
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }


    //因為該類的屬性都是string類型，因此我們這裡使用默認的clone完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}