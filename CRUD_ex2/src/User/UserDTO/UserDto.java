package User.UserDTO;

import java.sql.Timestamp;

public class UserDto {
	
	private int id;
	private String name;
	private int age;
	private Timestamp createdate;
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	public UserDto(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public UserDto(int id, String name, int age ) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	public UserDto(int id, String name, int age, Timestamp createdate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.createdate = createdate;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return  id +"\t" + name+"\t" +   age ;
//	}
//	
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", age=" + age + ", createdate=" + createdate + "]";
	}
	
}
