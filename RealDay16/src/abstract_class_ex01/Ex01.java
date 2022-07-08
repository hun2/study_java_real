package abstract_class_ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// Animal animal = new Animal(); // Cannot instantiate the type Animal 즉 추상클래스는 객체로 생성불가능
		Animal animal = new Tiger(); // tiger -> animal up casting 하는 것.
		animal.cry();
		animal.eat();
		// test.hello(); 불가능
		
		Tiger test = new Tiger();
		test.cry();
		test.eat();
		test.hello();
	}

}
