package com.bridge;

public abstract class Phone {
    //組合品牌
    private Brand mBrand;

    //構造器
    public Phone(Brand mBrand) {
        this.mBrand = mBrand;
    }

    protected void open(){
        this.mBrand.open();
    }

    protected void close(){
        this.mBrand.close();
    }

    protected void call(){
        this.mBrand.call();
    }

}
