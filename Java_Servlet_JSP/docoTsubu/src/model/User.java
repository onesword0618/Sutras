package model;

import java.io.Serializable;

public class User implements Serializable {

	// ユーザー名
	private String name;
	// パスワード
	private String pass;

	public User() {
	}

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return this.name;
	}

	public String getPass() {
		return this.pass;
	}
}
