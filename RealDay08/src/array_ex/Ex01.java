package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 배열 (Array) => 같은 자료형의 묶음. 
		// 배열의 초기화 방법 -1
		int[] scores = new int[5];
		 scores[0] = 3;
		 scores[1] = 4;
		 scores[2] = 5;
		 scores[3] = 6;
		 scores[4] = 7;
		 
		 System.out.println(scores[0]);
		 System.out.println(scores[1]);
		 System.out.println(scores[2]);
		 System.out.println(scores[3]);
		 System.out.println(scores[4]);
		 
		 
		 //배열의 초기화 방법 -2 
		 int[] score = {35, 45, 30, 20, 55};
		 System.out.println("첫번째 값 : " + score[0]);
		 System.out.println("두번째 값 : " + score[1]);
		 System.out.println("세번째 값 : " + score[2]);
		 System.out.println("네번째 값 : " + score[3]);
		 System.out.println("다섯번째 값 : " + score[4]);
		
		 
		 
		 //배열의 값 변경 방법
		 score[0] = 1000;
		 System.out.println(score[0]);
		 System.out.println(scores);  // hash 값이 출력 
		 
		 //배열의 전체 값 출력 
		 
		 for ( int i = 0 ; i < scores.length; i++) {
			 System.out.println(scores[i]);
		 }
		 
		 //배열의 전체 값 합 누적
		 int sum = 0;
		 for ( int i = 0 ; i < scores.length; i++) {
			 sum += scores[i];
		 }
		 System.out.println("합계는 : " + sum);
		 
		 
		 
	}

}
