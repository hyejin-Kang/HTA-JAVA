package day3;

public class Professor extends Person{

	private String dept;
	private String position;
	
	public Professor () {
		super();
	}
	
	public Professor(String name, String email, String tel, String dept, String position)
	{
		super(name, email, tel);
		this.dept= dept;
		this.position = position;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getPosition() {
		return position;
	}
	
	@Override
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("�а�" + dept);
		System.out.println("����" + position);
	}
	
}
