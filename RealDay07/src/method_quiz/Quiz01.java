package method_quiz;

import java.util.Scanner;

public class Quiz01 {
	
	public static int getSquared(int x) {
		int result = x * x;
		return result;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double result = (score1 + score2 + score3 + score4) /  (double) 4.0;
		return result;
	}
	
	 public static void printQuotientRemainder(int number1, int number2) {
		 int result = number1 % number2;
		 int result2 = number1 / number2;
		 System.out.println(" 몫 : " + result2);
		 System.out.println(" 나머지 : " + result);
	 }
	
	 public static void result(int number ) {
		 if (number % 2 == 0) {
			 System.out.println("true");
		 } else {
			 System.out.println("false");
		 }
		 
		 
		 // 삼항 연산자 boolean 리턴타입으로 하는경우
		 //return number % 2 == 0 ? true : false 
	 }
	 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		System.out.print("제곱값을 구할 숫자를 입력하세요:");
//		int number = scan.nextInt();
//		
//		//1번 제곱값 구하기
//		System.out.println(number + "의 제곱은 " + getSquared(number));
		
		//2번 
//		System.out.print("점수를 입력하세요 : ");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		int number4 = scan.nextInt();
//		System.out.println("평균은 " + getAverage(number1, number2, number3, number4));
		
		//3번 
//		System.out.print(" 숫자와 나눌 수를 입력하세요:");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		printQuotientRemainder(a, b);
		
		//4번
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		result(number);
		
		
		
		
	}

}
