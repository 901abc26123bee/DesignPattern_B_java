package com.chain;

public class DepartmantApprover extends Approver{
	
	public DepartmantApprover(String name) {
		super(name);
	}

	@Override
	public void proccessRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() <= 5000) {
			System.out.println("請求編號 id = " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
		}else {
			approver.proccessRequest(purchaseRequest);
		}
	}
	
}
