package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealQuiz01 {

	public static void main(String[] args) {
		
		
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newNames  = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈" , "루피" ));
		
		
		
		for ( int i =0; i<names.size(); i++) {
			
			String name = names.get(i);
			
			
			for ( int j = 0; j<newNames.size(); j++) {
				int number =1;
				if (name.equals(newNames.get(j))) {
					
					newNames.set(j, newNames.get(j)+ number);
					number++;
				}
			}
		}
		names.addAll(newNames);
		System.out.println("완성 :" + names );
		
		
		
		
		
		
		
		
		
		
	}

}
