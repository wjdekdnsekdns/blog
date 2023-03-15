package ch01;

public class UserTodo {

	private int id;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;


	public class company{
		private String companyname;
		private String catchPhrase ;
		private String bs;

		public String getCompanyname() {
			return companyname;
		}
		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}
		public String getCatchPhrase() {
			return catchPhrase;
		}
		public void setCatchPhrase(String catchPhrase) {
			this.catchPhrase = catchPhrase;
		}
		public String getBs() {
			return bs;
		}
		public void setBs(String bs) {
			this.bs = bs;
		}
		@Override
		public String toString() {
			return "company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
		}
		
		
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	@Override
	public String toString() {
		return "UserTodo [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", phone="
				+ phone + ", website=" + website + "]";
	}
	
	
	
}


