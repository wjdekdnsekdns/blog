package User.UserDTO;


public class UserDto {
	
	private int id;
	private String name;
	private int age;
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	public UserDto(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public UserDto(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return  id +"\t" + name+"\t" +   age ;
	}
	
	
}
