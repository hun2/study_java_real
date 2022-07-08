package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		
		Animal test  =  new Animal();
		test.eat();
		System.out.println("=====================");
		Cat test1 = new Cat();
		test1.cry();
		test1.eat();
		test1.grooming();
		System.out.println("=====================");
		Dog test2 = new Dog();
		test2.eat();
		test2.cry();
		test2.lash();
		
		//up casting (업캐스팅)  : 자식을 부모로 캐스팅
		//1. 부모 클래스의 메소드를 사용할 수 있다.
		//2. 부모 클래스에 있는 메소드를 오버라이드 한 메소드를 사용할 수 있다.
		//3. 자식 클래스에만 있는 메소드는 사용할 수 없다.
		
		System.out.println("=====================");
		Animal test3 = new Cat();    // (Animal)new Cat(); 원래 이거임. 생략된거 
		test3.cry(); // 자식클래스에서 재정의한 메소드는 출력가능.
		test3.eat(); // 부모클래스의 메소드 출력
		// test3.grooming(); 자식 클래스에서 생성한 메소드는 불가.
		
		System.out.println("=====================");
		Animal test4 = new Dog();
		test4.cry(); // 자식클래스에서 재정의한 메소드는 출력가능.
		test4.eat(); // 부모클래스의 메소드 출력
		//test4.lash(); 자식 클래스에서 생성한 메소드는 불가
		
		
		System.out.println("=====================");
		//down casting (다운캐스팅) : 
		//1.부모에서 자식으로 캐스팅
		//2. 자식 클래스가 여러개 이기때문에 명확하게 캐스팅 문법을 명시해야한다.
		//3. 어떤 자식 클래스인지 instanceof 명령어를 사용해서 검사해야한다.
		Cat test5 = (Cat) test3;
		if(test5 instanceof Cat) {
			test5.grooming();
			test5.eat();
			test5.cry();
		}
		
		System.out.println("=====================");
		Dog test6 = (Dog) test4;
		if(test6 instanceof Dog) {
			test6.lash();
			test6.eat();
			test6.eat();
			
		}
		
		
		
		
		
	}

}
