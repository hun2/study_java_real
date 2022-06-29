package two_d_arraty_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		//아래 배열은 5명의 10과목 시험 성적을 정리한 것 입니다.
		// 이 배열을 이용해서 아래 문제를 풀어보세요.
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		
		
		//1번 각 학생의 평균을 각각 구해서 출력하세요
		
		for ( int i = 0; i< scores.length; i++) {
			int sum = 0;
			for (int j =0; j< scores[i].length; j++) {
				
				sum += scores[i][j];
			}
			
			System.out.println( (i+1) +"번째 학생의 평균은 :" + ((double)sum/scores[i].length) );
		}
		
		
		
		//2번 각 학생의 최고 점수를 구해서 출력하세요.
		
		for ( int i = 0 ; i < scores.length; i++) {
			int number = 0;
			for ( int j = 0 ; j< scores[i].length; j++) {
				
				if ( number < scores[i][j]) {
					number = scores[i][j];
				}
				
			}
			System.out.println( (i+1)+ "번째 학생의 최고점은 " + number);
		}
		
		
		
		
		//3번  평균 최고점 구하기
		// 평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
		
		 double maxAverage = 0;
         int numberMax = 0;
		
		for ( int i = 0; i< scores.length; i++) {
			int sum = 0;
			for (int j =0; j< scores[i].length; j++) {
				sum += scores[i][j];
			}
					
			double average = (double)sum / scores[i].length;
            if (maxAverage < average) {
             maxAverage = average;
             numberMax = i +1;
            }
			
		}
		System.out.println("평균이 가장 높은 학생은 " + numberMax + "번째 학생이고, 평균 점수는 " + maxAverage);
		
		
		//4번 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
		int max = 0;
		int who = 0;
		
		for ( int i = 0; i < scores.length; i++) {
			int sum = 0;
			for ( int j = 0; j<= scores[i].length; j++ ) {
				
				if ( j == 3) {
					sum += scores[i][j];
				}
			}
			
			
			if ( max < sum ) {
				max = sum;
				who = i+1;
			}
		}
		
		System.out.println("4번째 과목의 최고 성적자는 " +  who + "번째 학생이고, 점수는 " + max);
		
		
	}

}
