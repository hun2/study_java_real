package abstract_class_ex01;


//부모 클래스
//추상클래스 : 추상메소드가 하나라도 존재하는 클래스 (일반 메소드도 구현가능)
//추상클래스는 객체 구현이 안된다.
//반드시 자식클래스로 객체구현 한다.
public abstract class  Animal {

	
	
	//추상메소드 : 자식 클래스가 반드시 구현해야 하는 메소드이다.
	// 즉 오버라이드를 꼭 해야한다.
	
	public abstract void cry();
		
	
	
	//일반메소드
	public void eat() {
		System.out.println("냠냠");
	}
	
	
	
}
