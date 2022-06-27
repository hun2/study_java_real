package function_ex;

public class Ex01 {
	
	
	
	public static void main(String[] args) {
		
		
		// method 사용하기
		//반올림
		double d = 3.68;
		
		long roundNumber = Math.round(d); // 인풋과 아웃풋을 잘 확인하여 변수화 하자. 
		// 인풋 = Math.round(d);      아웃풋 Math. 에 마우스 올리면 long 타입으로 반환
		System.out.println(roundNumber);
		System.out.println(Math.round(d));
		
		
		//큰 값을 구하는 함수(메소드)
		double max = Math.max(10.9, 11.8);    // 인풋 Math.max(); 아웃풋 : 인풋 넣은 타입형으로 반환
		System.out.println(max);
		System.out.println(Math.max(10.5, 31.5));
	
		//절대 값 구하는 함수(메소드) // 음수 값 제거된 값 출력
 		double abs = Math.abs(-5.5);
		System.out.println(abs);
		System.out.println(Math.abs(-3.333));
		
		// input값 : 전달 인자값 (Argument) => 각 메소드의 Argument 값을 잘 확인해야한다 ( 몇개 비교가능한지 등등 )
		// output 값 : return 값, 결과값 이라고 일컫는다. 어떤 리턴타입으로 반환되는 지 확인하고 변수화 한다. 
		
		
		
		
	}

}
