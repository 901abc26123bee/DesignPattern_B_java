package com.chain;

public class SchoolMasterApprover extends Approver{
	
	public SchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void proccessRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getPrice() > 30000) {
			System.out.println("請求編號 id = " + purchaseRequest.getId() + " 被 " + this.name + " 處理");
		}else {
			approver.proccessRequest(purchaseRequest);
		}
	}
}
