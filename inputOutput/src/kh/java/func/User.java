package kh.java.func;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialversionUID = 1111111l;
	private String name;
	private transient int age;
	private transient String addr;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
