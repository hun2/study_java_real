package polymophism_quiz;

public class Dog extends Animal{

	
	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
	public void lash () {
		System.out.println("꼬리 흔들흔들");
	}
	
}
