package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		
		//1. 아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
		// 국어 : 90, 수학 : 85, 영어 : 90, 사회 : 80, 과학 : 100
		Map <String, Integer> map = new HashMap<>();
		map.put("국어", 90);
		map.put("수학", 85);
		map.put("영어", 90);
		map.put("사회", 80);
		map.put("과학", 100);
		System.out.println(map);
		
		
		//2.값 수정 사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
		map.put("사회", map.get("사회") + 5);
		System.out.println(map);
		
		
		//3. 과목명을 입력 받고, 점수를 출력 하세요.
		//단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 과목명을 입력하세요 : ");
		String name = scan.next();
		if ( map.containsKey(name)) {
			System.out.println(name + " : " + map.get(name));
		} else {
			System.out.println("자료 없음");
		}
		
		
		//4.90점 이상의 모든 과목을 출력하세요.
		
		
		 Iterator<String> test = map.keySet().iterator();
		 while(test.hasNext()) {
			 
			 String a = test.next();
			 if ( map.get(a) >= 90) {
				 System.out.print(a + " ");
			 }
		 }
		
		
		 //5.100점 성적이 있는 학생에게 성적 우수상을 주기로 하였다.
		 //성적 우수상을 받을 수 있는지 출력하세요.
		 
//		 Iterator<String> test1 = map.keySet().iterator();
//		 while(test1.hasNext()) {
//			 
//			 String a = test1.next();
//			 if ( map.get(a) == 100) {
//				 System.out.println("수상 가능");
//			 } 
//		 }
		 
//		 if(map.containsValue(100)) {
//			 System.out.println("수상 가능");
//		 } else {
//			 System.out.println("해당 없음");
//		 }
		 
		 
	}

}
