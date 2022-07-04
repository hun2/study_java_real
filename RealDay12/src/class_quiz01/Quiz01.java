package class_quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.name = "유재석";
		student.className = "java";
		student.age = 21;
		student.phoneNumber = "01023453223";
		
		Student student1 = new Student();
		student1.name = "이효리";
		student1.className = "java";
		student1.age = 17;
		student1.phoneNumber = "01096482734";
		
		
		
		System.out.println(student.name);
		System.out.println(student.className);
		System.out.println(student.age);
		System.out.println(student.phoneNumber);
		student.isAdult();
		
		System.out.println();
		
		System.out.println(student1.name);
		System.out.println(student1.className);
		System.out.println(student1.age);
		System.out.println(student1.phoneNumber);
		student1.isAdult();
		
		
		
	}

}
