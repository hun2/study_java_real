package method_quiz;

import java.util.Scanner;

public class Quiz02 {
	
		public static int result(int a) {
			
			int sum = 0;
			for ( int i = 0; i <= a ; i++ ) {
				sum += i;
			}
			
			if ( sum > 100) {
				sum = 100;
			}
			return sum;
		}

		public static void result2(int a,int b , int c , int d , int e) {
			int result = a;
			if ( result > b) {
				result = b;
			} if ( result > c) {
				result = c;
			} if ( result > d ) {
				result = d;
			} if ( result > e) {
				result = e;
			}
			System.out.println("최소값은 " + result);
		}

		public static void result3(int number) {
			int count = 0;
			for ( int i = 2; i <= number; i++ ) {
				if ( number % i == 0 ) {
					count += 1;
				}
			}
			if ( count >= 2) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		}

		//boolean 리턴값 메소드 만들기
//		public static boolean isPrimeNumber(int number) {
//			for (int i = 2; i < number; i++) {                      // 복잡성 덜 돌리게 하는법은 number 에 루트를 씌우면 덜 돈다. 또는 number/2
//				if (number % i == 0 ) {                             // 루트 씌우는 법은 Math.sqrt(number); 예로 9면 3까지 출력됨.
//					return false;
//				} 
//			}
//			return true;
//		}
		
		public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		//1번 
//		System.out.print("수를 입력하세요 :");
//		int number = scan.nextInt();
//		System.out.println(result(number));
		
		//2번
//		System.out.print("5개의 수를 입력 하세요 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
//		result2(a, b, c, d, e);

		//3번
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		result3(number);
		

		}
}
