package com.ty.hospital.controller.branch;

import com.ty.hospital.service.imp.BranchServiceImp;

public class TestDeleteBranch {
	public static void main(String[] args) {
		BranchServiceImp branchServiceImp = new BranchServiceImp();
		boolean branch = branchServiceImp.deleteBranchById(5);
		if (branch != false) {
			System.out.println("Deleted Successfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
