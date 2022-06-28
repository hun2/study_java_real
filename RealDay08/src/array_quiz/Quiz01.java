package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		//1번 배열의 4번째 값을 6으로 바꾸세요.
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		numbers[3] = 6;
		
		//2번 배열의 값을 순서대로 출력하세요.
		for ( int i =0 ; i < numbers.length; i++ ) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//3번 배열의 값의 반대 순서(역순)로 출력하세요.
		for ( int i = numbers.length - 1; i >= 0; i-- ) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		//4번 배열의 짝수번째 위치에 있는 값들을 출력하세요.
		for ( int i = 0 ; i< numbers.length; i++ ) {
			if ( i % 2 != 0 ) {
				System.out.print(numbers[i] + " ");
			}
		}
		
		
//		 for ( int i = 1; i < numbers.length; i+=2){
//			System.out.print(numbers[i] + " ");
//			}
		
		System.out.println();
		
		//5번 배열의 값 중 2가 들어 있는 index를 출력하세요.
		for ( int i = 0 ; i < numbers.length; i++) {
			if ( numbers[i] == 2) {
				System.out.println("2가 들어있는 index 는 " + i);
			}
		}
		
		//6번 배열의 값 중 가장 큰 값을 출력하세요.
		int sum = numbers[0];
		for ( int i =1 ; i< numbers.length; i++) {
			
			if ( sum < numbers[i]) {
				sum = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 : " + sum);
		
		// 7번 배열의 값 중 가장 작은 수가 저장된 index를 출력하세요
		int min = numbers[0];
		int count = 0;
		for ( int i = 1 ; i < numbers.length; i++) {
			if ( min > numbers[i]) {
				min = numbers[i];
				count = i;
			}
			
		}
		System.out.println("최소값의 인덱스는 : " + count);
		
		//8번 배열의 모든 수의 평균을 출력하세요
		double number = 0;
		for ( int i =0; i < numbers.length; i++) {
			number += numbers[i];
		}
		
		System.out.println("평균은 : " + (number/numbers.length));
	}

}
