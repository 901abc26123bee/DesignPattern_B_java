package com.state;

public class DispenseState extends State {

    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除積分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽獎");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            System.out.println("恭喜中獎了");
            // 改變狀態為不能抽獎
            activity.setState(activity.getNoRafflleState());
        }else {
            System.out.println("很遺憾，獎品發送完了");
            // activity.setState(activity.getDispensOutState());
            System.out.println("抽獎活動結束");
            System.exit(0);
        }
    }


}