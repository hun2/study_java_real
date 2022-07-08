package polymophism_quiz01;

public class Triangle extends Shape{

	
	
	private double a;
	private double b;
	
	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public void printArea() {
		double result = (this.a * this.b) /2; 
		System.out.println("도형은 삼각형 이며" + "넓이는 " + result + "cm^2 입니다.");
	}
}
