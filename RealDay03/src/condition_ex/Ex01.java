package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몸무게를 입력하세요 :");
		int a = scan.nextInt();
		
		if ( a > 70 )  {
			System.out.println("그만 처먹으세요 제발");
		} else {
			System.out.println("먹어도 됩니다.");
		}
		
//		if ( a >= 80) {
//			System.out.println("양심이 없네요");
//		} else if (a >= 75) {
//			System.out.println("흠냐");
//		} else if (a >= 70) {
//			System.out.println("드세요");
//		} else {
//			System.out.println("사라져");
//		}
		
		
	}

}
