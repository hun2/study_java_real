package Inheritance_quiz;

public class HealthRate extends HealthInfo {

	
	
	
	public HealthRate(String name, int height, int weight) {
		//생성자를 만들지 않으면, 파라미가 없는 기본 생성자가 만들어진다.
		//파라미터 있는 생성자를 만들면, 기본 생성자가 만들어지지 않는다.
		//상속을 받게되면 자식클래스 객체 만들때 부모생성자가 먼저 불려진다.
		// 자식 생성자가 그 다음 호출된다.
		// 부모클래스에서 기본 생성자가 없다면, 파라미터 값 있는 생성자를 불러야한다. (자식에서)
		
		super(name, height, weight);
	}
	
	// 표준체중:SW=(H-100)*0.9
	public double count() {
		double sw = (super.height -100) * 0.9;
		return sw;
	}
	
	
	//비만도: B(%)=(W-SW)/SW * 100
	public String result() {
		
		double real = (super.weight-count()) / count() * 100;
		if (real < 10) {
			return "정상입니다.";
		} else if ( real >= 10 && real <20) {
			return "과체중입니다.";
		} else {
			return "비만입니다.";
		}
	}
	
	@Override
	public void showInfo() {
        System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + "kg 입니다." + " => " + result() );
    }
	
	
	
	
	
	
	
}
