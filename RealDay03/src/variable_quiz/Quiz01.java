package variable_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//1번 두 수를 입력 받아서 몫과 나머지를 출력하세요.
//		System.out.print("입력1 : ");
//		int a = scan.nextInt();
//		System.out.print("입력2 : ");
//		int b = scan.nextInt();
//		
//		System.out.println("몫 : " + a / b + " 나머지 :" + a%b);
		
		//2번 수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
//		System.out.print("x : ");
//		int x = scan.nextInt();
//		System.out.print("y : ");		
//		int y = scan.nextInt();
//		System.out.println("x는 " + y + "이고 , y는 " + x + "입니다.");
		
		
		//다른 방법
//		System.out.print("x : ");
//		int temp = 0;
//		int x = scan.nextInt();
//		System.out.print("y : ");
//		temp = x;
//		int y = scan.nextInt();
//		x = y;
//		y = temp;
//		System.out.println("x 는 " +  x  + " y 는 " + y);
		
		//3번 초를 입력 받아서 ?분?초 형태로 출력 하세요.
//		System.out.print("초 : ");
//		int a = scan.nextInt();
//		
//		System.out.println(a/60 + "분 " + a%60 + "초");
		
//		4번 네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
//		System.out.print("입력 : ");
//		int number = scan.nextInt();
//		
//		System.out.println((number/1000));
//		System.out.println((number%1000)/100);
//		System.out.println((number%100)/10);
//		System.out.println((number%10)/1);
		
		
//		5번 네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
		System.out.print("입력 : ");
		int number1 = scan.nextInt();
		int sum = (number1/1000) + (number1%1000)/100 + (number1%100)/10 + (number1%10)/1;
		System.out.println("합계는 " + sum + " 입니다.");
	
	}

}
