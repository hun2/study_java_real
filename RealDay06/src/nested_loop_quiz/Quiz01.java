package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 1번 주사위 문제	
		// 두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수를 출력하세요.
		
		
//		for ( int i = 1; i <= 6; i++) {
//			
//			for ( int j = 1; j<= 6;  j++) {
//				System.out.print("(" + i + ", " + j+ ")");
//			}
//			System.out.println();
//		}
		
		
		
		
//		//2번 구구단을 2단에서 부터 9단 까지 모두 출력하세요.
//		
//		for ( int i = 2; i <= 9; i++) {
//			for (int j = 1; j<= 9; j++) {
//				System.out.println(i + " X "+ j + " = " + (i*j));
//				
//			}
//
//		}


		
		//3번 별찍기 
		
//		for ( int i = 1; i <=5 ; i++) {
//			
//			for ( int j = 0; j <i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//4번 별찍기
		
		
//		for ( int i = 1; i <=5; i ++) {
//			for ( int j =5; j>i-1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		//5번 별찍기
		for ( int i = 0; i <= 4; i++) {

			for ( int j = 0; j < 5-i ; j++ ) {
			System.out.print(" ");
			}

			for ( int j = 0; j < 2*i+1; j++) {
			System.out.print("*");
			}

			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
