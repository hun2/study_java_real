package array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		
		int[] numbers = {3, 5, 2, 10, 39};
		
		// 1번 index와 값을 차례로 입력 받아서, 아래 배열에 해당하는 index에 값을 바꾸고 출력 하세요.
//		Scanner scan = new Scanner(System.in);
//		System.out.print("변경할 index와 값을 입력하세요 : ");
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		
//		numbers[number] = number1;
//		
//		for ( int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] +  " ");
//		}
		
		//2번 아래와 같이 O 와 X로 채점 결과가 저장된 배열이 있다. 100점 만점 기준으로 몇점을 맞았는지 출력하세요.
		
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		
//		int count = 0;
//		for ( int i = 0; i < scores.length; i++ ) {
//			if ( scores[i] == 'O') {
//				count += 10;
//			}
//		}
//		System.out.println(count + "점");
		
		
		
		//3번 아래 배열은 각각 월, 화, 수, 목, 금, 토, 일 7일간의 아르바이트를 한 시간을 나타낸다.
		// 시급 기준이 아래와 같을때 7일 동안 일한 총 임금의 값을 출력하세요.
		// 평일 시급 : 8500원 ,  주말(토,일) 시급 : 9500원
		
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int pay = 0;
//		int realPay = 0;
//		for ( int i = 0; i < works.length; i ++) {
//			if ( i <= 4) {
//				pay += 8500 * works[i];
//			} if ( i >= 5 ) {
//				realPay += 9500 * works[i];
//			}
//		}
//		
//		System.out.println(" 일주일간 총 임금은 : " + (pay + realPay) + "원");
		
		
		
		//4번 배열 값 변경 길이가 5인 int 배열을 만든다.
		// 수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
		// 배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
//		Scanner scan = new Scanner(System.in);
//		int[] exmple = new int[5];
//		
//		for ( int i =0; i <exmple.length; i++) {
//			System.out.print("수를 입력하세요 : ");
//			int number = scan.nextInt();
//			if ( number % 2 == 0) {
//				exmple[i] = number;
//			} else {
//				i--;
//			}
//		}
//		for (int i =0; i<exmple.length; i++) {
//			System.out.print(exmple[i] + " ");
//		}
		
 	}

}
