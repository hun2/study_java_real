package string_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		
		
		// 아래와 같이 생년이 저장된 String 이 있을때 올해 나이를 출력하세요.(한국나이)
		
		
		String birthday = "1995";
		int a = Integer.valueOf(birthday);
		int age = (2022 - a) +1;
		System.out.println(age + "세");
		
	}

}
