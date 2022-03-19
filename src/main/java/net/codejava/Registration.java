package net.codejava;

public class Registration {
	private String username;
	private String password;
	private String securityQuestion;
	private String securityAnswer;


	public Registration() {
	}

	public Registration(String username, String password, String securityQuestion, String securityAnswer) {
		this.username = username;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return this.securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return this.securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	@Override
	public String toString() {
		return "{" +
			" username='" + getUsername() + "'" +
			", password='" + getPassword() + "'" +
			", securityQuestion='" + getSecurityQuestion() + "'" +
			", securityAnswer='" + getSecurityAnswer() + "'" +
			"}";
	}
	

}