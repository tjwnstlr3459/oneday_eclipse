package vo;

public class Members {

	private String id;
	private String pass;
	private String name;
	private int age;
	private String phon;
	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Members(String id, String pass, String name, int age, String phon) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.phon = phon;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public String getPhon() {
		return phon;
	}
	public void setPhon(String phon) {
		this.phon = phon;
	}
	@Override
	public String toString() {
		return getId()+"\t"+getName()+"\t"+getAge()+"\t"+getPhon();
	}
	
}
