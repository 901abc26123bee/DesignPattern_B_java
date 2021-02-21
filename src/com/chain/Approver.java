package com.chain;

public abstract class Approver {
	Approver approver; // 下一個處理者
	String name; // 名字
	
	public Approver(String name) {
		this.name = name;
	}
	// 下一個處理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	// 處理省批請求的方法，得到一個請求，處理事子類完成，所以此方法做成抽象
	public abstract void proccessRequest(PurchaseRequest purchaseRequest);
}
