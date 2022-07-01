package class_ex_01;

public class ScoreData {

	
	//속성 : 멤버변수 또는 필드(field)
	
	int score;
	String name;
	int ranking;
	
	
	//행위 : 메소드 또는 멤버함수
	
	void printInFo() {
		System.out.println("과목명 :" + this.name);
		System.out.println("점수 :" + this.score);
		System.out.println("등수 :" + this.ranking);
	}
	
	
	
}
