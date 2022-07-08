package polymophism_quiz01;

public class Rectangle extends Shape {

	
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
		
	}
	
	
	@Override
	public void printArea() {
		double result = this.a * this.b; 
		System.out.println("도형은 사각형 이며" + "넓이는 " + result + "cm^2 입니다.");
	}
	
}
