package com.state.money;

public class ClientTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new PublishState());
        System.out.println(context.getCurrentState());

        context.acceptOrderEvent(context);
        System.out.println(context.getCurrentState());
        
        context.feedBackEvent(context);
        System.out.println(context.getCurrentState());
    }


}