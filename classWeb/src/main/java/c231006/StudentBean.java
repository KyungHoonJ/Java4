package c231006;

public class StudentBean {
	private String name;
	private int num;
	
	public StudentBean(){}

	public StudentBean(String name){
		this.name = name;
	}
	public StudentBean(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
}
