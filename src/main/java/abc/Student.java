package abc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

	private int id;
	private String name;
	private boolean sex;
	private String address;
	private int age;

	// bắt buộc 1 contructỏ rỗng
	public Student() {
	}

	public Student(int id, String name, Boolean sex, String address, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.address = address;
		this.age = age;
	}

	@Id // khóa chính
	@GeneratedValue // tự động tăng
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

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
