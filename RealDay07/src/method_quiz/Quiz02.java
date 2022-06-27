package method_quiz;

import java.util.Scanner;

public class Quiz02 {
	
	public static int result(int a) {
		int sum = 0;
		for ( int i = 0; i <= a ; i++ ) {
			sum += i;
		}
		return sum;
	}
	
	public static void result2(int a,int b , int c , int d , int e) {
		int result = a;
		if ( result > b) {
			result = b;
		} if ( result > c) {
			result = c;
		} if ( result > d ) {
			result = d;
		} if ( result > e) {
			result = e;
		}
		System.out.println(result);
	}
	
	public static void result3(int number) {
		if ( number % 2 ==0  || number % 3 == 0) {
			System.out.println("false"); 
		} else {
			System.out.println("true");
		}
	}
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner (System.in);
	
	//1번 
//	System.out.print("수를 입력하세요 :");
//	int number = scan.nextInt();
//	System.out.println(result(number));
	
	//2번
//	System.out.print("5개의 수를 입력 하세요 : ");
//	int a = scan.nextInt();
//	int b = scan.nextInt();
//	int c = scan.nextInt();
//	int d = scan.nextInt();
//	int e = scan.nextInt();
//	result2(a, b, c, d, e);
	
	//3번
//	System.out.print("수를 입력하세요 : ");
//	int number = scan.nextInt();
//	result3(number);
		
	}

}
