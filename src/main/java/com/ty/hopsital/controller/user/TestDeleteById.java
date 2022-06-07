package com.ty.hopsital.controller.user;

import com.ty.hospital.dto.User;
import com.ty.hospital.service.imp.UserServiceImp;

public class TestDeleteById {
	public static void main(String[] args) {
		UserServiceImp userServiceImp = new UserServiceImp();
		User user = userServiceImp.deleteUserById(2);
		if (user != null) {
			System.out.println("Deleted succesfully");
		} else {
			System.out.println("No data is found");
		}
	}
}
