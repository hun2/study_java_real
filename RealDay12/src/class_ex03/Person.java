package class_ex03;

public class Person {

	
	// private 로 설정하는 것은 은닉화 한다라고 함.
	private String name;
	private String age;
	private String sex;
	
	
	
	public void hello() {
		System.out.println("인사하기");
	}
	
	public void walk() {
		System.out.println("걷기");
	}
	
	public void self () {
		System.out.println("내 이름은 " + this.name + "이고, 성별은 "+ this.sex + "이다.");
	}
	
	public void age() {
		int a = Integer.valueOf(this.age.substring(0,4));
		int b = (2022 - a) + 1;
		System.out.println("나이는 " + b + "이다");
	}

	//생성자 (constructor) : 객체가 생성될 때 불려지는 특수한 메소드
	// 반드시 리턴 타입이 없어야 한다.
	public Person() {
		System.out.println("응애~~~");
	}
	
	
	//생성자 오버로딩 : 파라미터의 타입이 다르거나, 개수가 다르거나 할때
	public Person(String name, String age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		System.out.println("파라미터가 있는 생성자 호출");
	}
	
	
	//캡슐화
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public String getSex() {
		return this.sex;
	}
	
}
