package ncs.test08;

//- id:String
//-password:String
//- name:String
//- age:int
//- gender:char
//- phone:String
//+User()
//+User(id:String, password:String,
//name:String, age:int, gender:char,
//phone:String)
//+toString():String
//+equals(obj:Object):Boolean
//+clone():Object
//+getXXX()
//+setXXX()

public class User implements Cloneable {

	String id, password, name;
	int age;
	char gender;
	String phone;

	public User() {

	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {

		return String.format("%s  %s  %s  %d  %c  %s", id, password, name, age, gender, phone);
	}

	// +equals(obj:Object):Boolean
	// +clone():Object
	// +getXXX()
	// +setXXX()

	@Override
	public boolean equals(Object obj) {

	    User other = (User) obj; // obj를 User 타입으로 캐스팅

	    return id.equals(other.id) &&
	           password.equals(other.password) &&
	           name.equals(other.name) &&
	           age == other.age &&
	           gender == other.gender &&
	           phone.equals(other.phone);
	}

	public Object clone() {

		try {
			return (User) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
