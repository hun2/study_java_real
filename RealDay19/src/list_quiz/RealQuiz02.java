package list_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RealQuiz02 {

	public static void main(String[] args) {

		
		
		List<String> names = new ArrayList<>(Arrays.asList("우솝", "루피", "상디", "나미", "로빈"));
		List<String> newNames  = new ArrayList<>(Arrays.asList("보람", "루피", "쵸파", "로빈" , "루피" ));
		
		
		for ( int i =0; i<newNames.size(); i++) {
			
			String newName = newNames.get(i);
			int number = 1;
			
			while(newName.contains(newName)) {
				newName =  newNames.get(i) + number;
				number++;
			}
			names.add(newName);
		}
		
		System.out.println(names);
		
		
		
		
		
		
	}

}
