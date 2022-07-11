package list_quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//1. 리스트에 주어진 값들을 넣으세요.

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		System.out.println(list);
		
		
		
		//2. 최소값 구하기
		int result = list.get(0);
		for ( int i =0; i <list.size(); i++) {
			
			if ( result > list.get(i)) {
				result = list.get(i);
			}
			
		}
		System.out.println(result);
		
		
		//3. 합계 구하기
		//List 요소들의 총 합계를 구하세요.
		
		

	}

}
