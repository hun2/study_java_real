package array_quiz;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		
		//1번 위치 변경 (swap)  두 개의 index를 입력 받아서, 해당하는 index의 값을 서로 교체 해서 배열을 출력하세요.
		
//		int[] numbers = {3, 5, 2, 10, 39};
//		Scanner scan = new Scanner(System.in);
//		System.out.print("두 개의 index를 입력하세요 : ");
//		int number = scan.nextInt();
//		int number1 = scan.nextInt();
//		int a = 0;
//		
//		for ( int i = 0; i < numbers.length; i++) {
//			
//			if ( i == number) {
//				a = numbers[i]; 
//				numbers[i] = numbers[number1];
//			} if ( i == number1) {
//				numbers[i] = a;
//			}
//		}
//		for ( int i =0; i<numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
		
		
		
		
		//2번 배열 순서 변경  1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		
//		int[] result = {1,2,3,4,5,6,7,8,9,10};
//		Random rand = new Random();
//		
//		
//		for (int i = 0; i < 100; i++) {
//		    int randIndex = rand.nextInt(10); // 0 ~ 9까지의 숫자를 랜덤으로 뽑는다.
//		    int a = result[0]; 
//		    result[0] = result[randIndex];
//		    result[randIndex] = a;
//		}
//		
//		for ( int i = 0; i<result.length; i++ ) {
//			System.out.println(result[i]);
//		}
		
		
		//3번 배열 빈도수 구하기  1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
		
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		int aa = 0;
//		int bb = 0;
//		int cc = 0;
//		int dd = 0;
//		int ee = 0;
//
//		for ( int i = 0; i < numbers3.length; i++ ) {
//			if ( numbers3[i] == 1) {
//				aa++;
//			}
//			if (numbers3[i] == 2) {
//				bb++;
//			}
//			if (numbers3[i] == 3) {
//				cc++;
//			}
//			if (numbers3[i] == 4) {
//				dd++;
//			}
//			if (numbers3[i] == 5) {
//				ee++;
//			}
//		}
//		System.out.println("1 : " + aa + "개");
//		System.out.println("2 : " + bb + "개");
//		System.out.println("3 : " + cc + "개");
//		System.out.println("4 : " + dd + "개");
//		System.out.println("5 : " + ee + "개");
		
		
		
		// 3번 배열문제 다른 방법
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] test = new int[6]; // 0 0 0 0 0 0
		
		for ( int i = 0; i < numbers3.length; i++ ) {
					
			test[numbers3[i]] += 1;
			
		}
		
		for ( int i = 1; i < test.length; i++ ) {
			System.out.println(i + ": " + test[i]+  "개 ");
		}
	}

}
