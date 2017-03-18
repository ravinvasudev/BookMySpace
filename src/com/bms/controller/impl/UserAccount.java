package com.bms.controller.impl;

import com.bms.controller.UserAccountController;
import com.bms.model.Ack;
import com.bms.model.User;
import com.bms.model.UserAuth;
import com.bms.model.UserProfile;

public class UserAccount implements UserAccountController {

	@Override
	public Ack createAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserAuth authenticate(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ack getResetPasswordToken(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ack uppdatePassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserProfile getUserProfile(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
