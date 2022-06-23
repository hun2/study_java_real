package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 반복문 (loop) for문 
		for (int i = 0; i < 5; i++) {
			System.out.println("for 문 반복");
		}
		
		//반복문 while 문
		int a = 1;
		while ( a < 5) {
			System.out.println("while 문 반복");
			a++;
		}
		
		//반복문 do while 문
		int b = 1;
		do {
			System.out.println("do while 문 반복");
			b++;
		}
		while (b < 5);
		
		
		// ++i와 , i++ 의 차이점
		int number = 6;
		System.out.println("number " + number);
		System.out.println("++number " + (++ number)); // 지금 바로 ++을해서 출력하는 것 .
		System.out.println("number++ " + ( number++)); // 지금하지 않고 다음에 더함 즉 출력안해줌.
		System.out.println("number " + number);
		
		//0~ 4 => 5번 
		int i = 0;
		while (i <= 4) {
			System.out.println("후후");
			i++;
		}
		
		// 1~ 5번 => 5번
		int j = 1;
		while ( j <= 5 ) {
			System.out.println("호호" + j );
			j++;
		}
		
		// 5 ~ 0 => 6번
		int ii = 5;
		while ( ii >= 0) {
			System.out.println("해해" + ii);
			ii--;
		}
		
		
		// 1부터 10까지 합구하기
		int sum = 0;
		for ( int iii = 1; iii <= 10 ; i++) {
			iii++;
			sum += iii;
		}
		
		System.out.println("1부터 10까지 합은?" + sum);
	
		
		
		
		
		
		
		
	}

}
