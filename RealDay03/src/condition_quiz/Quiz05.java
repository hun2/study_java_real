package condition_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1번 두 점수를 입력 받고, 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		System.out.print("두 점수를 입력하세요 :");
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		double result = number + number1;
//		
//		if (result/2 >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
	
		
		
		//2번 세 개의 정수를 입력 받아서 가장 큰 값을 출력하세요.
//		System.out.print("세 개의 수를 입력하세요 : " );
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int result = number;
//		
//		if ( result < number1) {
//			result = number1;
//		} 
//		if (result < number2) {
//			result = number2;
//		} 
//		
//		System.out.println(result);
		
		
		//3번 과락 포함 합격 여부 점수 두 개를 입력 받고 합격 여부를 출력하세요.
//		System.out.print("점수 1 :");
//		int number = scan.nextInt();
//		System.out.print("점수 2 :");
//		int number1 = scan.nextInt();
//		
//		double result = (number + number1) / (double)2;
//		
//		if ( result >= 60 && number >=50 && number1 >= 50) {
//			System.out.println("합격");
//		} else {
//			System.out.println("과락");
//		}
		
		
		//4. 윤년 구하기
		//연도를 입력 받아서 윤년인지 평년인지 출력하세요.
		//윤년 조건 4로 나누어 떨어지는 연도는 윤년이다.
		
		
		System.out.print("연도 :");
		int number = scan.nextInt();
		if ( number %4 == 0 && number%100 != 0 || number%400 ==0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		
		

		
		
		//5번 윷놀이 4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
		// 윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
		
//		System.out.print("윷 상태를 입력하세요 :");
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		int result = number + number1 + number2 + number3;
//		
//		if (result == 1  ) {
//			System.out.println("도");
//		} else if (result == 2) {
//			System.out.println("개");
//		} else if (result == 3) {
//			System.out.println("걸");
//		} else if (result == 4) {
//			System.out.println("윷");
//		} else {
//			System.out.println("모");
//		}
		
		
		
		
	}

}
