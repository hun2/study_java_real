package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("모래시계 크기를 입력하세요 :");
		int number = scan.nextInt();
		
		for ( int i = 1 ; i <= number; i++ ) {
			
			for (int j = 1; j<= number;  j++ ) {
				
				if ( i % 2 !=0) {
					if ( j %2 !=0)
					System.out.print("*");
				} else {
					System.out.print("+");
				}
				
				if ( i % 2 == 0 ) {
					if ( j %2 !=0) {
						System.out.print("-");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
		
	}

}
