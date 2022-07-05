package class_ex03;


public class Ex03 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("김기훈");
		person.setAge("19910121");
		person.setSex("남");
		person.hello();
		person.self();
		person.walk();
		person.age();
		System.out.println("=====================");
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getSex());
		
		System.out.println("=====================");
		
		
		Person person1 = new Person("김아무개", "19900121", "남");
		person1.hello();
		person1.self();
		person1.walk();
		person1.age();
		person1.setName("하이잉");
		person1.setAge("19880101");
		person1.setSex("여자요");
		
		person1.self();
		
	}

}
