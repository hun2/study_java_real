package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//do- while 문 거짓이여도 반드시 한번은 실행된다.
		
//		int i = 0;
//		do {
//			System.out.println("안녕" + i);
//			i++;
//		}
//		while(i > 3);
		
		
		
		
		//while 0~4 => 5번
//		i =0;
//		while(i <= 4) {
//			System.out.println("와일문 " + i);
//			i++;
//		}
		
		
		//for 문 0~4 => 5번
		for ( int i = 0; i<= 4; i++) {
			System.out.println("for문" + i);
			
		}
		
		
		// 1~ 5: 5번
		for (int i = 1; i <=5; i++) {
			System.out.println("for문" + i);
		}
		
		
		// 5 ~ 1 : 5번
		for ( int i = 5 ; i >=1 ; i--) {
			System.out.println("for 문 " + i);
		}
		
		
		//  1부터 10까지 합계
		int sum = 0;
		for ( int i = 1 ; i <=10; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
