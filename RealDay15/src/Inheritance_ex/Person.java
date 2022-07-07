package Inheritance_ex;


//부모 클래스 Super class, Parent class
public class Person {

	protected String name;
	
	
	public Person() {
		System.out.println("응애");
	}
	
	
	public Person(String name) {
		this.name = name;
		System.out.println("파라미터가 있는 Person 생성자 " + this.name);
	}
	
	
	
	public void introduce() {
		// 내이름은 00 입니다.
		System.out.println("내 이름은 " + this.name + "입니다."); 
	}
	
	
}
