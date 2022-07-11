package list_ex;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("안녕");
		list.add("반가워");
		list.add("오냐");
		
		
		//1. 인덱스 기반으로 출력
		for ( int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
			//만약 x 로 시작하는 요소 제거
			if (list.get(i).startsWith("안")) {
				list.remove(i);
				i--;
			}
		}
		System.out.println(list);
		
		
		//2. 
		
	}

}
