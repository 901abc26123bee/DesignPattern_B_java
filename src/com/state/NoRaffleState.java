package com.state;
// 不能抽獎的狀態
public class NoRaffleState extends State{
	// 初始化時引入活動引用，扣除積分後改變其狀態
    RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }
    // 當前狀態可扣積分，扣除後，其狀態設置為可以抽獎的狀態
    @Override
    public void deductMoney() {
        System.out.println("扣除50積分成功，您可以抽獎了");
        activity.setState(activity.getCanRaffleState());
    }

    // 當前狀態不能抽獎
    @Override
    public boolean raffle() {
    	System.out.println("扣除積分後才能抽獎");
        return false;
    }

    @Override
    public void dispensePrize() {
    	System.out.println("不能發放獎品");
    }
}