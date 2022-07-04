package class_quiz01;

public class Student {

	
	String name;
	String className;
	int age;
	String phoneNumber;
	
	
	
	void isAdult() {
		if ( this.age >= 20) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
	}
	
	
	
	
	
	
}
