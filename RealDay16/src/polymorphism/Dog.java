package polymorphism;

public class Dog extends Animal{

	
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	
	public void lash() {
		System.out.println("꼬리치기");
	}
	
	
}
