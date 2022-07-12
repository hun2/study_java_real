package set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		
		//Set
		//중복되지 않는다
		//인덱스 기반이 아니다. (순서가 없음)
		
		
		
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set.add(3)); // false 중복되지 않으므로 
		System.out.println(set);
		
		
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set.addAll(set2);
		System.out.println(set);
		
		
		
		// set 에 10이 있는가?
		System.out.println(set.contains(10));
		
		
		// set 에서 set2 을 차집합 : set -set2
		set.removeAll(set2);
		System.out.println(set);
		
		
		// TreeSet
		Set<String> set3 = new TreeSet<>();
		set3.add("b");
		set3.add("a");
		set3.add("c");
		
		System.out.println(set3);
		
		//반복문으로 출력하기
		//인덱스가없으므로 일반 for문 사용불가. 향상된 for문이랑 이터레이터만 가능.
		
		//1. Iterator
		Iterator<String> test = set3.iterator();
		while(test.hasNext()) {
			String a = test.next();
			System.out.println(a);
		}
		
		//2. 향상된 for문
		
		for (String test1 : set3) {
			System.out.println(test1);
		}
		
		
	}

}
