package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		//자료입력
		// 아래 과목 이름과 성적 정보를 Map 저장하고 출력 하세요.
		
		Map<String , Integer> map = new HashMap<>();
		map.put("국어", 90);
		map.put("수학", 85);
		map.put("영어", 90);
		map.put("사회", 80);
		map.put("과학", 100);
		System.out.println(map);
		
		
		//값 수정
		//사회 시험의 채점에 문제가 있어서 5점을 더 올려야 한다.
		
		map.put("사회", 85);
		System.out.println(map);
		
		
		// 값 찾기
		//과목명을 입력 받고, 점수를 출력 하세요.
		//단, 입력한 과목이 없을 경우 "자료 없음"을 출력 하세요.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 과목명을 입력하세요 :");
		String a = scan.next();
		
		
		if (map.containsKey(a)) {
			System.out.println(a + " : " + map.get(a));
		} else {
			System.out.println("자료없음");
		}
		
		
		
		
	}	
	
}
