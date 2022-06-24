package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
	
	
		//break문 => 강제로 멈추게 한드앗
		
		//무한루프에서 hello world 다섯번찍기
		
		int count = 0;
		
		while (true) {
			if (count == 5) {
				break;
			}
			System.out.println("hello world " + count);
			count += 1;
		}
		
		
		//for 문으로 무한루프
		for (int j = 0;; j++) {
			
			if ( j == 5) {
				break;
			}
			
			System.out.println("for 문 무한루프 " + j );
		}
		
		
		
		//continue : skip을 하는것. 아래코드들을 수행하지 않고 즉시 조건을 본다.
		
		// 1~ 10까지의 수 중에서 4의 배수일 때 숫자를 출력하지 않기
		
		for (int i = 1; i<=10 ; i++) {
			if ( i % 4 == 0) {
				continue;
				
			}
			System.out.println(i);
		}
		
		
		
		
		
	
	}

}
