package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {
		
		
		
		//1번 리스트에 주어진 값들을 넣고 출력하세요.

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(8);
		list.add(9);
		list.add(4);
		list.add(2);
		list.add(1);
		list.add(7);
		list.add(5);
		System.out.println(list);
		
		
		
		//2번 List의 네번째 값을 6으로 바꾸고 전체를 출력하세요.

		
		list.set(3, 6);
		System.out.println(list);
		
		
		//3번 값 삭제하기 List에서 8과 7을 삭제하고 전체를 출력하세요.
		
		
		Integer a = 8;
		Integer b = 7;
		list.remove(a);
		list.remove(b);
		
		System.out.println(list);
		
		
		
		
		// Arrays.asList 로 만들면 값을 수정하거나 삭제할 수 없다(고정 리스트)
		List<Integer> list1 = Arrays.asList(3,8,9,4,2,1,7,5);
		List<Integer> list2 = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));
		list2.add(555);
		System.out.println(list2);
	}

}
