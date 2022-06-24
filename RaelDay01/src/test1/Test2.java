package test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for (int i =1; i <= number ; i++) {
			
			
			
			for (int j = 1; j<= number; j++ ) {
				if (j % 2 != 0) {
					System.out.print("*");
				} else {
					System.out.print("+");
				}
				
				
			}
			
			
			
				
			
			System.out.println();
			
			
		}
	}

}
