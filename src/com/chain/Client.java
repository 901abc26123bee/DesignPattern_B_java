package com.chain;


public class Client {
	public static void main(String[] args) {
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 1000, 1);
		
		DepartmantApprover departmantApprover = new DepartmantApprover("departmant");
		CollegeApprover collegeApprover = new CollegeApprover("college");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("ViceSchoolMaster");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("SchoolMaster");
		
		// 需要將各個省批級別的下一個設置好（處理人搆成環狀）
		departmantApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmantApprover);
		
		schoolMasterApprover.proccessRequest(purchaseRequest);
	}
}
