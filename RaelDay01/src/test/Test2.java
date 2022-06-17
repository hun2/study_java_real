package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
			
		
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "반가워");
		map.put(2, "반가워2");
		map.put(3, "반가워3");
		map.put(4, "반가워4");
		
		
		
		Set <Integer> set = map.keySet();
		Iterator<Integer> iter =  set.iterator();
		
		while(iter.hasNext()) {
		int a = iter.next();
		System.out.println(a);
		}

	}

}
