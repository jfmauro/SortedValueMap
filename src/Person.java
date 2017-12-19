
public class Person {
	private Long id;
	private String email;
	private int age;
	
	public Person(){}
	
	public Person(Long id, String email, int age) {
		super();
		this.id = id;
		this.email = email;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
}
