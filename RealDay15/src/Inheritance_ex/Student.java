package Inheritance_ex;

public class Student extends Person{

	private String major;
	
	public Student() {
		System.out.println("학생 입니다.");
	}
	
	
	public Student(String name, String major) {
		super(name); // 부모 생성자 호출
		this.major = major;
//		this.name = name;
//		super.name = name; 
		
		System.out.println("파라미터 있는 학생 생성자");
	}
	
	
	@Override // 상속기반 부모클래스의 메소드를 자식클래스에서 재정의 하는것.
	public void introduce() {
		// 내이름은 00 입니다.
		super.introduce();
		System.out.println("내 과목은 " + this.major + "입니다.");
	}
	
	
}
