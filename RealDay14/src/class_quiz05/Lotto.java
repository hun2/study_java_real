package class_quiz05;

import java.util.Random;

public class Lotto {

	private int[] lotto =  new int[6];
	
	//getter & setter 값으로 수동 번호 받는 방법
	public int[] getLotto() {
		return lotto;
	}

	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}

	
	//생성자 파라미터 값으로 수동 번호 받는 방법
	public Lotto(int[] lotto) {
		this.lotto = lotto;
	}
	
	public Lotto() {
		
	}

	// 오토 번호 자동으로 발급받는 메소드
	public int[] auto() {

		Random rand = new Random();
		int[] num = new int[6];
		
		for ( int i =0; i < num.length; i++) {
			num[i] = rand.nextInt(45) + 1;
			for ( int j =0; j<i; j++) {
				if ( num[i] == num[j]) {
					i--;
					break;
				}
			}
			this.lotto = num;
		}
		return this.lotto;
	}
	
	
}
