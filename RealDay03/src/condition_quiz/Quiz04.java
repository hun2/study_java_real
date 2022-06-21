package condition_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		
		//절 구하기 월(month)를 입력 받아서 어떤 계절인지 출력하세요.
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 :");
		int number = scan.nextInt();
		
		switch(number) {
		case 3 : case 4 : case 5 :
			System.out.println("봄");
		case 6 : case 7 : case 8 :
			System.out.println("여름");
		case 9 : case 10 : case 11 :
			System.out.println("가을");
		case 12 : case 1 : case 2 :
			System.out.println("겨울");
		}
		
		
		
		
	}

}
