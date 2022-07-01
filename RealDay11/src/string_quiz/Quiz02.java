package string_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//1번 id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력 하세요 : ");
		String id = scan.next();
		System.out.println("Welcome! " + id);
		
		
		//2번 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
		System.out.print("단어를 입력하세요 :");
		String english = scan.next();

		int count = 0;
		
		for ( int i =0; i<english.length(); i++) {
			if (english.charAt(i) == english.charAt(0) ) {
				count += 1;
				
			}
			
		}

		System.out.println("e의 개수는 " + count + "개 입니다.");
		
		
		
		
		//3번 테스트
//		System.out.print("단어를 입력하세요 :");
//		String english = scan.next();
//		int count1 = 0;
//		String test = "e";
//		for ( int i =0; i<english.length(); i++) {
//			if (english.charAt(i) == 'e') {
//				count1 += 1;
//				
//			}
//			
//		}
//		System.out.println("e의 개수는 " + count1 + "개 입니다.");
		
		
		
		
		
	}

}
