package polymophism_quiz01;

public class Circle extends Shape {

	private double a;
	
	public Circle(double a) {
		this.a = a;
	}
	
	@Override
	public void printArea() {
		double result = this.a * this.a * Math.PI; 
		System.out.println("도형은 원 이며" + "넓이는 " + result + "cm^2 입니다.");
	}
	
	
	
}
