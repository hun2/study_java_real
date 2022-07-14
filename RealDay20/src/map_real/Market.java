package map_real;

import java.util.ArrayList;
import java.util.List;

public class Market {
	
	
	List<Goods> test = new ArrayList<>();
	
	
	
	
	public void c (String a, String b , String c) {
		
		
		Goods goods = new Goods();
		
		goods.setName(a);
		goods.setCost(b);
		goods.setPossible(c);
		
		if (test.contains(a)) {
			System.out.println("등록된 상품이 존재합니다.");
			
		} else if ( !c.equals("판매중") && !c.equals("판매완료") && !c.equals("판매가능")) {
			
			System.out.println("판매상태가 유효하지 않습니다.");
		} else {
			
		}
		test.add(goods);
	}
	
	public void r () {
		
		if (test.isEmpty()) {
			System.out.println("비어 있습니다.");
		} else {
			System.out.println(test);
		}
		
	}

	
	
	
	
	
}
