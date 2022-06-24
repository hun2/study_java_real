package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 중첩반복문 : 반복문 안에 반복문
		// 바깥 반복문 : 천천히 돈다.  <행>    ex) 세트 
		// 안쪽 반복문 : 빨리 돈다. <열>       ex) 횟수
		
		//스쿼트 10회
		
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("스쿼트 " + i + "회");
//		}
		
		
		// 3세트 스쿼트 10회
		
//		for ( int i = 1; i<= 3; i ++ ) {
//			
//			for ( int j = 1; j <= 10; j++) {
//				System.out.println("스쿼트 " + j + "회");
//				
//			}
//			
//			System.out.println("스쿼트 " + i + "세트 ");
//		}
		
		
		
		
		// ***** 한줄짜리 별 다섯개 찍기
		
		for ( int i = 1; i<=5; i++) {
			
			for ( int j = 1; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
