package list_quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		
		//1  체조 경기 평균 점수 
		// 체조 경기에서 아래와 같은 심사위원 점수가 집계 되었습니다.
		// 최고점과 최저점을 제외한 나머지 점수의 평균을 구하세요.
		// [8, 7, 6, 10, 9, 4]
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);
		list.add(4);
		//출력
		System.out.println(list);
		
		
		int max = list.get(0);
		int min = list.get(0);
		int sum = 0;
		for (int i = 0; i<list.size(); i++) {
			
			
			if ( max > list.get(i)) {
				max = list.get(i);
			} 
			if ( min < list.get(i)) {
				min = list.get(i);
			}
			
			sum += list.get(i);
		}
		double average = (sum - (max + min)) / 4.0; 
		
		System.out.println("최저점과 최고점을 제외한 평균 점수는 " + average);
		
		
		
		//2. 회원관리 리스트를 만든다. [우솝, 루피, 상디, 나미, 로빈]
		List<String> list2 = new ArrayList<>();
		list2.add("우솝");
		list2.add("루피");
		list2.add("상디");
		list2.add("나미");
		list2.add("로빈");
		
		System.out.println(list2);
		// 새로 입력할 이름을 기존 리스트에 추가한다.
		//만약 동명이인이 있을 경우 회원명 뒤에 숫자를 붙인다.
		
		Scanner scan = new Scanner(System.in);
		List<String> list3 = new ArrayList<>();
		
		int number = 1;
		for (int i = 0; i <list2.size(); i++ ) {
			System.out.print("입력하셈 : ");
			String a = scan.next();
			for ( int j =0; j<list2.size(); j++) {
				if ( list2.get(i).equals(a)) {
					a = a + number;
					number++;
				}
			}
			
			list3.add(a);
		}
		
		System.out.println(list3);
		
		
//		list2.addAll(list3);
//		System.out.println(list2);
	}
	
	
	
}
