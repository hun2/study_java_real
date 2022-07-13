package map_quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CapitalTest {

	
	
		// final : 한번만 초기화 하는것
		// 1. 변수 앞 가능 : 한번 초기화 된 변수에 값 재할당 불가
		// 2. 메소드 앞 : 오버라이드 불가
		// 3. 클래스 앞 : 상속 불가
	    public static final Map<String, String> capitalMap = new HashMap<String, String>() {
	        {
	            put("대한민국", "서울");
	            put("덴마크", "코펜하겐");
	            put("독일", "베를린");
	            put("러시아", "모스크바");
	            put("벨기에", "브뤼셀");
	            put("브라질", "브라질리아");
	            put("스웨덴", "스톡홀름");
	            put("스위스", "베른");
	            put("스페인", "마드리드");
	            put("아르헨티나", "부에노스아이레스");
	            put("이집트", "카이로");
	            put("이란", "테헤란");
	            put("이탈리아", "로마");
	            put("일본", "도쿄");
	            put("필리핀", "마닐라");
	            put("핀란드", "헬싱키");
	            put("프랑스", "파리");
	            put("터키", "앙카라");
	            put("캐나다", "오타와");
	            put("콜롬비아", "보고타");
	        }
	    };
	
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        Set<String> keys = capitalMap.keySet();
        List<String> keyList = new ArrayList<>(keys); // 나라이름 List의 index로 문제 낼 것
		List<Integer> randList = new ArrayList<>();
		
		
		for ( int j =0; j<5; j++) {
    		int number = rand.nextInt(20);
    		if ( randList.contains(number)) {
        		j--;
        	}
    		randList.add(number);
        	
    	}
		
		System.out.println("중복제거한 5개의 수 :" + randList);
		
		int result = 0;
        for(int i = 0; i < 5; i++ ) {
        	
        	System.out.print(keyList.get(randList.get(i)) + "의 수도 이름은?");
        	String answer = scan.next();
        	if ( answer.equals(capitalMap.get(keyList.get(randList.get(i))))) {
        		System.out.println("정답");
        		result += 20;
        	}  else {
        		System.out.println("틀렸습니다");
        	}
        }
		
        System.out.println("총 점수는 "+ result);
        
		
		
	}
}
