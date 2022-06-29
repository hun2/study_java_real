package two_d_arraty_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 2차원 배열
		// 바깥쪽 : 행,   안쪽 : 열
		int[][] scores = {
				
				{95, 31, 85},
				{70, 55, 32},
				{36, 41, 66},
				{62, 59, 13},
				{12, 7, 99}
				
		};
		
		
		System.out.println("3번째 학생의 두번째 점수는: " + scores[2][1]);
		System.out.println("2번째 학생의 첫번째 점수는: " + scores[1][0]);
		System.out.println("5번째 학생의 세번째 점수는: " + scores[4][2]);
		
		// 반복문으로 2차원 배열 값 출력
		
		for (int i = 0 ; i <scores.length; i++ ) {  //행 : 학생 
			
			for (int j = 0; j<scores[i].length; j++) { //열 : 시험 점수의 개수
				
				System.out.println((i + 1) + "번째 학생의 " + (j +1 ) + "번째 점수는 : " + scores[i][j] );
			}
		}
		
		
		
		//학생들의 점수 평균을 출력
		
		for ( int i =0; i<scores.length; i++ ) {
			int sum = 0;
			for ( int j =0; j<scores[i].length; j++ ) {
				
				sum += scores[i][j];
				
				
			}
			System.out.println(i + "번째 학생의 평균 점수는 :" + (sum/scores[i].length));
		}
		
		
		
		
		
		
		
		
		
	}

}
