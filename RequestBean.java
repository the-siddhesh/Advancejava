package Advance.java.lecture3.Beans;

public class RequestBean {
	
	String name;
	int age;
	String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return  name + " " + age + " " +address;
	}
	
	
//	assignment create json object
//	
//	{
//		"id" : val,
//		"name" : name,
//		"working " : true
//		"address " : {
//			"id" : val,
//			"name" : name,
//			"working " : true
//		}
//	}
	
	
	

}
