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
		
		
		
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getSex());
		
		
		
	}

}
