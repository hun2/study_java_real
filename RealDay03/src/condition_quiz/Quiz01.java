package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
//		 1번 숫자를 입력 받아서 10보다 작은 수인지 큰 수인지, 같은지를 출력하세요.
//		System.out.print("숫자를 입력하세요 :");
//		int number = scan.nextInt();
//		
//		if ( number < 10 ) {
//			System.out.println("10보다 작습니다.");
//		} else if (number == 10){
//			System.out.println("10이랑 같습니다.");
//		} else {
//			System.out.println("10보다 큽니다.");
//		}
		
		
		
		//2번 두 숫자 a, b 를 입력 받아서 a가 클 경우 "a가 더 큽니다." 를
		// b가 클 경우 "b가 더 큽니다."를 같을 경우 "a와 b는 같습니다."를 출력하세요
		
//		System.out.print("두 개의 수를 입력하세요 : ");
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		
//		if ( number > number1) {
//			System.out.println("a 가 더큽니다.");
//		} else if (number < number1){
//			System.out.println("b 가 더 큽니다.");
//		} else {
//			System.out.println("a와 b는 같습니다.");
//		}
		
		
		
		
		//3번 시험 합격 70점 이상이면 합격하는 시험에서 점수를 입력 받아서 합격 여부를 출력하세요.
//		System.out.print("성적을 입력하세요 :");
//		int number = scan.nextInt();
//		
//		if (number >= 70) {
//			System.out.println("합격입니다.");
//		} else {
//			System.out.println("불합격입니다.");
//		}
		
		
		
		//4번 홀짝 검사 수를 입력 받아서 짝수 인지 홀수 인지 출력하세요.
		System.out.print("수를 입력하세요 :");
		int number = scan.nextInt();
		if (number % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}
		
	}

}
