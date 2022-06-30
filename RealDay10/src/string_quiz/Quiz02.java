package string_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		
		//1번 문자	아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
		
		//2번 아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요. (한국나이)
		String birth = "19950721";
		birth = birth.substring(0,4);
		int a = Integer.valueOf(birth);
		
		int age = (2022 - a) + 1;
		System.out.println(age + "세");
		
		
		//3번 아래 문자열의 단어 개수를 출력 하세요.(중복 포함)
		String sentence = "To be, or Not to Be. That Is The Question";
		
		
		
		
	}

}
