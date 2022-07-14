package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		
		
		// List 입력, 출력, 삭제 하기
		
		// ＊1:입력 2:출력 3:삭제 4:종료
		// ＊무한루프를 돌고, 4번을 누르면 입력 종료
		
		Scanner scan = new Scanner(System.in);
		
		List<String> fruits = new ArrayList<>();
		
		while (true) {
		
			
			System.out.println("1:입력 2:출력 3:삭제 4:종료");
			int number = scan.nextInt();
			int test = 1;
			if (number == 1) {
				System.out.print("과일을 입력하세요 :");
				String a = scan.next();
				if ( fruits.contains(a)) {
					fruits.add(a + test++); 
				} else {
					fruits.add(a);
				}
				
				System.out.println("입력 성공");
				
			} else if (number == 2) {
				System.out.println(fruits);
			} else if ( number == 3) {
				System.out.print("삭제할 과일을 입력하세요 :");
				String b = scan.next();
				
				if ( fruits.contains(b)) {
					fruits.remove(b);
				} else {
					System.out.println("잘못 입력 하셨습니다. 초기화면으로 돌아갑니다.");
					continue;
				}
				
				System.out.println("삭제 성공");
			} else if ( number == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
			
			
			
		}
		
	}

}
