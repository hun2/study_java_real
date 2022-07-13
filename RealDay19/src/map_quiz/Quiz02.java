package map_quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		// Map에 키에 이름(유재석, 박나래, 이지은, 서장훈, 이광수)을 넣고, 값을 모두 'X'로 초기화 하세요.
		Map<String, String> map = new HashMap<>(); // Character 로 넣을 수 있음.
		map.put("유재석", "X");
		map.put("박나래", "X");
		map.put("이지은", "X");
		map.put("서장훈", "X");
		map.put("이광수", "X");
		
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			
			String number = iter.next();
//			System.out.println(number);
			if (number.startsWith("이")) {
				map.put(number, "O");
			}
			
		}
		
		System.out.println(map);
		
		
	}

}
