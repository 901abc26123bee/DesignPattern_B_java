package com.composite;

public abstract class OrganizationComponent {
    private String name;//名字
    private String des;//說明

    //構造器
    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //使用默認實現，不寫成抽象方法原因：讓leaf節點無須重寫此方法（用不到）
        new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默認實現
        new UnsupportedOperationException();
    }

    //方法print，做成抽象的，子類都需要實現
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
