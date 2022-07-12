package map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//Map
		//1. key - vaule 쌍으로 이뤄져 있다.
		//2. key 는 중복되지 않는다. value는 중복가능. (ex 주민번호와 - 이름 관계)
		//3. key를 통해서 value를 아주 빠르게 찾을 수 있다
		//4. value로 key를 찾을 수 없다.
		
		
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 10);
		map.put("d", 10);
		
		System.out.println(map);
		
		// key 로 값 얻어오기
		System.out.println(map.get("a"));
		System.out.println(map.get("b"));
		System.out.println(map.get("c"));
		System.out.println(map.get("d"));
		
		// 수정 : 기존에 있는 키에 put을 하면 수정이 된다. (덮어쓰기 되는것)
		map.put("d", 100);
		System.out.println(map.get("d"));
		
		// 존재 여부 ( 키 값 둘다 존재 여부)
		System.out.println(map.containsKey("c"));
		System.out.println(map.containsValue(1));
		
		
		//map의 크기 요소의 갯수
		System.out.println(map.size());
		
		//key만 가져오기
		Set<String> set = map.keySet();
		System.out.println(set);
		
		//value 만 가져오기
		Collection<Integer> values =  map.values();
		System.out.println(values);
		
		
		//key 로 value 삭제하기
		Integer test = map.remove("a"); // 리턴타입은 어떤 값을 삭제했는지 
		System.out.println(test);
		System.out.println(map);
		
		
		//key 와 value로 요소 삭제하기
		map.remove("d", 100); // 리턴타입은 성공여부
		System.out.println(map);
		
		
		//map에 map 전체 추가하기
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("q", 500);
		map.putAll(map2);
		System.out.println(map);
		
	}

}
