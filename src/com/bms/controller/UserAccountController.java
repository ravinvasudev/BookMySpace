package com.bms.controller;

import com.bms.model.Ack;
import com.bms.model.User;
import com.bms.model.UserAuth;
import com.bms.model.UserProfile;

/**
 * @author Ravin Vasudev
 * 
 * @serial Version 1
 * 
 * @since March 2016
 * 
 *        <p>
 *        Handles user account operations.
 *        </p>
 *        <li>Login.</li>
 *        <li>New account creation.</li>
 *        <li>Password reset.</li>
 *        <li>Get user profile.</li>
 *
 */
public interface UserAccountController {

	public abstract Ack createAccount(User user);

	public abstract UserAuth authenticate(String username, String password);

	public abstract Ack getResetPasswordToken(String emailId);

	public abstract Ack uppdatePassword(String password);

	public abstract UserProfile getUserProfile(String userId);

}
