package com.bms.model;

import java.io.Serializable;

public class UserAuth implements Serializable {

	private static final long serialVersionUID = -5450161181968912999L;

	private Ack ack;

	private String token;

	private String avatar;

	public UserAuth() {

	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Ack getAck() {
		return ack;
	}

	public void setAck(Ack ack) {
		this.ack = ack;
	}

	@Override
	public String toString() {
		return String.format("UserAuth [ack=%s, token=%s, avatar=%s]", ack,
				token, avatar);
	}

}
