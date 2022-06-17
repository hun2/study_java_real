package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//리스트에 주어진 값들을 넣으세요.
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(3);
		list.add(5);
		list.add(84);
		list.add(17);
		
		
		//최소값 구하기
		int answer = list.get(0);
		for (int i =0; i < list.size(); i++) {
			
			
			if (list.get(i) < answer) {
				answer = list.get(i);
			}
			
		}
		
		System.out.println(answer);
		
		
		//합계구하기
		int sum = 0;
		Iterator<Integer> list1 = list.iterator();
		while(list1.hasNext()) {
			sum += list1.next();
		}
		System.out.println(sum);
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
