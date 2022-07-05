package class_quiz04;

import java.util.Scanner;

public class OmrCard {

	
	// ＊문제는 객관식으로 문제 개수는 총 5개이다.(답은 1~5중에 하나만 선택 가능)
	// 학번과 이름을 입력 받는다.
	// 순서대로 학생의 답 5개를 입력받는 메소드를 만든다.
	
	
	private String name;
	private int number;
	private int[] anwser = new int[5];
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int[] getAnwser() {
		return anwser;
	}
	public void setAnwser(int a, int b, int c , int d, int e) {
		this.anwser[0] = a;
		this.anwser[1] = b;
		this.anwser[2] = c;
		this.anwser[3] = d;
		this.anwser[4] = e	;
		
	}
	
	
}
