package class_quiz01;

public class Rectangle {

	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		// 기본 출력
		System.out.println("가로 " +  width + "cm, 세로 " + height + "cm 사각형이 만들어 졌습니다.");
		this.width = width;
		this.height = height;
		
	}
	
	public int width() {
		int a = this.width * this.height;
		return a;
	}
	
	public int height () {
		int a = (this.width + this.height) * 2;
		return a;
	}
	
}
