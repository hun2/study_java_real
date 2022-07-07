package class_quiz05;

import java.util.Random;

public class LottoChecker {

	
	private int[] reallotto = new int[6];
	
	
	
	public int[] reallotto() {
		
		Random rand = new Random();
		int[] lotto = new int[6];
		for ( int i = 0; i <lotto.length; i++) {
			
			lotto[i] = rand.nextInt(45) + 1;
			
			for ( int j = 0; j<i; j++) {
				
				if ( lotto[i] == lotto[j]) {
					
					i--;
					break;
				}
			}
			
		}
		
		this.reallotto = lotto;
		return this.reallotto;
	}
	
	
	public void reallotto2() {
		System.out.print("당첨번호 : ");
		for ( int i = 0; i<reallotto.length; i++) {
			System.out.print(reallotto[i] + " ");
		}
	}
	
	
	public void resultPrint(Lotto lotto) {
		
		int result = 0;
		
		for (int i =0; i<reallotto.length; i++) {
			
			for (int j =0; j<lotto.getLotto().length; j++) {
				
				if (reallotto[i] == lotto.getLotto()[j]) {
					result++;
					break;
				}
			}
		}
		
		
		if ( result < 3) {
			System.out.println("꽝");
			System.out.println("==============");
		} else if ( result == 3) {
			System.out.println("4등");
			System.out.println("==============");
		} else if ( result == 4) {
			System.out.println("3등");
			System.out.println("==============");
		} else if ( result == 5) {
			System.out.println("2등");
			System.out.println("==============");
		} else if ( result == 1) {
			System.out.println("1등");
			System.out.println("==============");
		}
		
	}
	
	
	
	
	
	
	
}
