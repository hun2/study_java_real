package string_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		

		Scanner scan = new Scanner(System.in);
		System.out.println("단어를 입력하세요 :");
		String word  = scan.next(); // 단어
		System.out.println(word); 
		
		scan.nextLine(); // 불필요한 엔터를 날려버린다.
		
		System.out.println("문장을 입력하세요 : ");
		String test = scan.nextLine(); // 문장(스페이스바 포함)
		System.out.println(test);
	}

}
