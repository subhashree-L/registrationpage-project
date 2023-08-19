
public class Member {
	
	private String uname, password, email, phone,state;
     
	
	
	public Member() {
		super();
	}

	public Member(String uname, String password, String email, String phone, String state) {
		super();
		this.uname = uname;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.state = state;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	

}
