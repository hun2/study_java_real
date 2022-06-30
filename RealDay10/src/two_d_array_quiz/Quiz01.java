package two_d_array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		
		//1번 [2][3] 크기의 배열을 만드세요. 반복문을 이용해서, 모든 곳에 10을 넣고 출력하세요.
		int[][] array = new int[2][3];
		
		for ( int i = 0; i<array.length; i++ ) {
			
			for ( int j = 0; j < array[i].length; j++) {
				
				array[i][j] = 10;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		//2번 [3][4] 크기의 배열을 만드세요.  반복문을 이용해서, 아래와 같이 각 배열에 1~4를 저장 하고, 출력하세요.
		
		int[][] array1 = new int[3][4];
		
		for ( int i = 0; i<array1.length; i++ ) {
			
			int a = 1;
			for ( int j = 0; j < array1[i].length; j++) {
				
				array1[i][j] = a;
				System.out.print(array1[i][j] + " ");
				a++;
			}
			System.out.println();
		}
		
		
		//3번 [3][3] 크기의 배열을 만드세요.  반복문을 이용해서, 첫 번째 행은 1, 두 번째 행은 2, 세 번째 행은 3으로 채우고 출력하세요.
		
		
		int[][] array2 = new int[3][3];
		int a = 1;
		for ( int i = 0; i<array2.length; i++ ) {
			
			
			for ( int j = 0; j < array2[i].length; j++) {
				
				array2[i][j] = a;
				System.out.print(array2[i][j] + " ");
				
			}
			System.out.println();
			a++;
		}
		
		
		//4번 [5][5] 크기의 배열을 만드세요.  모든 값을 0으로 초기화 하세요. 반복문을 이용해서, 아래와 같이 + 위치에 1을 입력 하고 출력하세요.
		
		int[][] array3  = new int[5][5];
		
		int b = 1;
		for ( int i = 0 ; i<array3.length; i++) {
			if ( i == 2) {
				for ( int j = 0; j<array3.length; j++) {
					array3[i][j] = b;
				}
			}
			for ( int j = 0; j<array3.length; j++) {
				
				if (j == 2) {
					array3[i][j] = b;
				}
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//5번 [3][3] 크기의 배열을 만드세요. 반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
		int[][] array4 = new int[3][3];
		
		int c = 1;
		for ( int i = 0; i< array4.length; i++ ) {
			
			for ( int j = 0; j<array4[i].length; j++ ) {
				
				array4[i][j] = c;
				c++;
				System.out.print(array4[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		//6번 [3][3] 크기의 배열을 만드세요. 반복문을 이용해서, 아래와 같은 형태로 숫자를 차례로 저장하고 출력 하세요.
		int [][] array5 = new int[3][3];
		
		int e = 1;
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5.length; j++) {
				array5[i][j] += e;
				System.out.print(array5[i][j]+" ");
				e += 3;
			}
			e =i+2;
			System.out.println();
		}
			
		
		
	}

}
