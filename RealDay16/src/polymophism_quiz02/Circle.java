package polymophism_quiz02;

public class Circle extends Shape {

	public Circle (int radius) {
		this.name = "원";
		this.area = radius * radius * Math.PI;
		
	}
}
