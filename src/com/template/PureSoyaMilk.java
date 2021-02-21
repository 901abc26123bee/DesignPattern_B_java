package com.template;

public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
