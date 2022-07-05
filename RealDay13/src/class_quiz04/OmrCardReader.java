package class_quiz04;

public class OmrCardReader {
	
	
	//객체 생성 시 문제의 정답 5개를 입력받아 정답 배열에 저장해둔다.
	// ＊OmrCard 하나를 입력받아서 이름, 학번, 점수(100점 만점)를 출력한다.
	
	
	//정답을 미리 결정해놓는 방법으로 진행해보기
	private int[] realAnswer  = new int[] {3,2,2,5,2};
	
	public void printScore(OmrCard card) {
		System.out.println(card.getName());
		System.out.println(card.getNumber());
		
		int score = 0;
		for (int i =0; i < this.realAnswer.length; i++) {
			if (this.realAnswer[i] ==  card.getAnwser()[i]) {
				score += 20;
			}
		}
		
		System.out.println("점수 :" + score);
	}
	
	
	
}
