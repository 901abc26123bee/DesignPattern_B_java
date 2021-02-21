package com.state.money;

import lombok.Data;

@Data
public class Context extends AbstractState {
    //當前的狀態 state, 根據我們的業務流程處理，不停的變化
    private State state;

    @Override
    public void checkEvent(Context context) {
        state.checkEvent(context);
        getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        state.checkFailEvent(context);
        getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) {
        state.makePriceEvent(context);
        getCurrentState();
    }

    @Override
    public void acceptOrderEvent(Context context) {
        state.acceptOrderEvent(context);
        getCurrentState();
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        state.notPeopleAcceptEvent(context);
        getCurrentState();
    }

    @Override
    public void payOrderEvent(Context context) {
        super.payOrderEvent(context);
        getCurrentState();
    }

    @Override
    public void orderFailureEvent(Context context) {
        state.orderFailureEvent(context);
        getCurrentState();
    }

    @Override
    public void feedBackEvent(Context context) {
        state.feedBackEvent(context);
        getCurrentState();
    }

    @Override
    public String getCurrentState() {
        System.out.println("當前狀態 : " + state.getCurrentState());
        return state.getCurrentState();
    }
}
