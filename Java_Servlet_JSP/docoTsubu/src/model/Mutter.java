package model;

import java.io.Serializable;

public class Mutter implements Serializable {
	// ユーザー名
	public String username;
	// つぶやき内容
	private String text;

	public Mutter() {
	}

	public Mutter(String userName, String text) {
		this.username = userName;
		this.text = text;
	}

	public String getUserName() {
		return this.username;
	}

	public String getText() {
		return this.text;
	}
}
