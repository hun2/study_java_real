package class_ex_01;

public class Ex01 {

	public static void main(String[] args) {

		
		ScoreData score = new ScoreData(); // 객체로 만든다. 인스턴스 화 한다.
		
		
		//필드 값 넣기
		score.name = "수학";
		score.ranking = 3;
		score.score = 81;
		
		
		//필드 값 출력하기
		System.out.println(score.name);
		System.out.println(score.ranking);
		System.out.println(score.score);
		score.printInFo();
		
		
	}

}
