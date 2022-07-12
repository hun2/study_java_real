package list_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//1.리스트에 주어진 값들을 넣으세요. 20 3 5 84 17
		
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		System.out.println(list);
		
		
		
		//2.  최소값 구하기 List에서 가장 작은 값을 출력하세요. for문을 사용하세요.(향상된 for문 X)
		
		int sum = list.get(0);
		for (int i =1; i<list.size(); i++) {
			if (sum > list.get(i)) {
				sum = list.get(i);
			}
		}
		
		System.out.println(sum);

		
		//3.  List 요소들의 총 합계를 구하세요. Iterator를 사용하세요.
		
		Iterator<Integer> test = list.iterator();
		int b = 0;
		while(test.hasNext()) {
			int a = test.next();
			b += a;
		}
		
		System.out.println(b);
		
		
		
	}

}
