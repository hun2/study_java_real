package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//1번
		// 수를 입력 받아서 1부터 입력 받은 수까지의 합을 출력하세요.
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int sum = 0;
//		
//		for (int i = 0; i <= number; i++) {
//			sum += number;
//		}
//		
//		System.out.println(sum);
		
		
		//2번 팩토리얼 수를 입력 받고 그 수의 팩토리얼을 출력하세요.
		// 입력 받는 수의 최대값은 10이다. 5! = 1 * 2 * 3 * 4 * 5
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int triple = 1;
//		for ( int i = 2; i<= number; i++ ) {
//			triple *= i;
//		}
//		
//		System.out.println(triple);
		
		
		
		//3번 수를 입력 받아서 그 수의 약수를 모두 출력하세요.
		//약수: 어떤 수를 나누어 떨어지게 하는 수
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		for ( int i = 1; i <= number ; i++) {
			if ( number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		//continue 문으로 돌릴때
//		for ( int i = 1; i <= number ; i ++) {
//			if (number % i != 0) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		
		
		
		
		
	}

}
