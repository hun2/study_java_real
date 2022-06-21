package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		
		//논리 연산자
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 :");
		int number = scan.nextInt();
		
		//number가 10이상이고 , 40이하이다. (그리고 , AND)
		if ( number >=10 && number <= 40) {
			System.out.println("맞아요~!");
		} else {
			System.out.println("아니거든요~");
		}
		
		
		//nuber가 10보다 작거나 40보다 크다 (또는 , OR)
		if (number <10 || number >40) {
			System.out.println("맞아요");
		} else {
			System.out.println("아니거든요");
		}
		
		
		
		
	}

}
