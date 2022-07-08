package polymophism_quiz02;

public class Triangle extends Shape {

	private int base;
	private int height;
	
	
	public Triangle(int base, int height) {
		super.name = "삼각형";
		super.area = base * height /2;
	}
	
	
	
	
}
