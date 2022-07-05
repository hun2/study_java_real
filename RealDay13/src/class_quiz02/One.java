package class_quiz02;

public class One {
	
	
	private int radius;
	private double pi = 3.14;
	
	
	public void width(int radius) {
		this.radius = radius;
		
		System.out.println("원의 넓이 : " + (radius * radius) * pi);
	}
	
	
	public void circumference(int radius) {
		this.radius = radius;
		System.out.println("원의 둘레 :" + (radius * 2) * pi);
	}
	
	public void width(int radius, int a) {
		this.radius = radius;
		System.out.println("원 "+ a + "개 넓이 : " + ((radius * radius) * pi) * a);
	}
	
	
	
}
