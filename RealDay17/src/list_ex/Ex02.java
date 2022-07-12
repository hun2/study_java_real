package list_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("안녕");
		list.add("반가워");
		list.add("오냐");
		
		
		//1. 인덱스 기반으로 출력
//		for ( int i = 0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//			
//			//만약 x 로 시작하는 요소 제거
//			if (list.get(i).startsWith("안")) {
//				list.remove(i);
//				i--;
//			}
//		}
//		System.out.println(list);
		
		
		//2. Iterator 사용하기 -> 커서의 개념이 등장.
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String test = iter.next(); // next() 호출할때 마다 소비가 되므로, 반복문에서 한번만 수행
//			System.out.println(test);
//			
//			if (test.startsWith("안")) {
//				iter.remove(); // 리스트에서 삭제가 아니고 반드시 iterator 의 remove로 삭제햐야함. 
//			}
//		}
//		
//		System.out.println(list);
		
		
		//3. 향상된 for 문으로 사용
		// 조회할때만 사용하는게 좋다. 자바 jre 버전에 따라서 오류가 발생하므로 
		for (String test:list) { // 오른쪽이 list
			System.out.println(test);
			if ( test.startsWith("안")) {
				list.remove(test);
			}
		}
		
		
		
		
		
		
	}

}
