package list_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 배열
		// 1. 크기를 미리 알고 있어야 한다. 크기가 고정되어 있다.
		// 2. 중간에 값을 빼내게 되면 빈 상태가 된다.
		// 3. index 기반으로 접근 가능하다.
		// 4. 기본자료형, 클래스 타입도 모두 담을 수 있다.
		
		// List
		// 1. 크기가 고정 되어 있지않고, 동적으로 할당 가능.
		// 2. 중간에 있는 값을 빼내면 앞으로 당겨진다 값들이. 메모리 낭비가 없다.
		// 3. 여러 방법으로 데이터를 다룰 수 있다.(많은 메소드)
		// 4. 클래스 타입만 담을 수 있다 (기본 자료형 저장안됨 > int , char 등등)
		// 5. 타입 안정성을 위해 보장하는 generic 문법을 쓸 수 있다.
		
		// List Interface 의 실제 구현체인 ArrayList 사용
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		boolean isSuccess = list.add(3);
		System.out.println(isSuccess);
		System.out.println("list :" + list);
		
		// List Interface 의 실제 구현체인 LinkedList 사용
		List<Integer> list2 = new LinkedList<>();
		list2.add(5);
		list2.add(3);
		list2.add(2);
		list2.add(4);
		System.out.println(list2);
		
		
		list2.addAll(list);
		System.out.println(list2);
		
		
		//요소수정하기
		//요소 첫번째 값을 수정 
		System.out.println("값 변경 전 값: " + list2.set(0, 100)); // 변경될 위치 인덱스, 변경할 값 - 리턴 되는 값 삭제된 값을 출력해줌
		System.out.println("값 변경 후 " +  list2); // 결과 출력
		
		
		//요소 값 삭제
		Integer deletedValue = list2.remove(0); // 리턴되는 값 삭제된 값을 출력해줌
		System.out.println("삭제된 값: " + deletedValue);
		System.out.println("삭제 후 출력 " + list2);
		
		
		List<String> test = new ArrayList<>();
		test.add("안녕");
		test.add("하세요?");
		System.out.println("삭제 잘 됬나요? " + test.remove("안녕"));
		System.out.println(test);
		
		
		
		//모든 요소를 삭제
		list2.clear();
		System.out.println(list2);
		
	}

}
