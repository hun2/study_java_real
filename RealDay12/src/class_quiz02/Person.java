package class_quiz02;

public class Person {

	
	
	String name;
	String age;
	String sex;
	
	
	
	void hello() {
		System.out.println("인사하기");
	}
	
	void walk() {
		System.out.println("걷기");
	}
	
	void self () {
		System.out.println("내 이름은 " + this.name + "이고, 성별은 "+ this.sex + "이다.");
	}
	
	void age() {
		int a = Integer.valueOf(this.age.substring(0,4));
		int b = (2022 - a) + 1;
		System.out.println("나이는 " + b + "이다");
	}
	
	
	
}
