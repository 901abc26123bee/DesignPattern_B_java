package com.state.money;

public abstract class AbstractState implements State{

    protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允許");
    
    // 抽象類，默認實現 State 接口的所有方法
    // 該類所有的方法，其子類（具體的狀態類），可以有選擇地進行重寫
    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(Context context) {
    	throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
    	throw EXCEPTION;
    }

}