package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		// 4로 나누어 떨어지는 연도는 윤년이다.
		// 100으로 나누어 떨어지는 연도는 윤년이 아니다.
		// 400으로 나누어 떨어지는 연도는 무조건 윤년이다.

		Scanner scan = new Scanner(System.in);
		System.out.print("연도 :");
		int number = scan.nextInt();
		
		
		//1. 
		if ( number % 4 == 0 && number % 100 != 0 || number % 400 ==0  ) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		
		
		
		
		//2번째 방법
//		if ( number % 400 ==0) {
//			System.out.println("윤년");
//		} else if (number % 100 == 0){
//			System.out.println("평년");
//		} else if (number % 4 ==0) {
//			System.out.println("윤년");
//		} else {
//			System.out.println("평년");
//		}
			
			
		
	}

}
