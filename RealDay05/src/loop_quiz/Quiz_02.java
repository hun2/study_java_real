package loop_quiz;

import java.util.Scanner;

public class Quiz_02 {
	
	public static void main(String[] args) {
		
		
		//1번 35 ~ 40 까지 출력 하세요
		for (int i = 35 ; i <= 40; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//2번 카운트 다운 출력 5 ~ -5 까지 출력하세요
		
		for ( int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//3번 특정 조건 구하기 1 ~ 50 사이에 3의 배수만 출력하세요.
		for ( int i = 1; i <= 50 ; i++) {
			if ( i %3 ==0)
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//4번 갯수 세기 1 ~ 100 사이에 7의 배수 갯수를 구하세요.
		int sum = 0;
		
		for ( int i =1 ; i <= 100; i++) {
			if ( i % 7 == 0) {
				sum += 1;
			}
		}
		System.out.println("7의 배수의 갯수는 : " + sum);
		
		
		//5번 수를 입력 받아서 해당하는 단수의 구구단을 출력 하세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 :");
		int number = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(number + " X " + i + " = " + (number*i));
		}
		
		
		
		
		
		
	}
}
