package class_quiz06;

public class Deck {

	
	// 스페이드(spade), 하트(heart), 다이아몬드(diamond), 클로버(club) 
	// 네 가지의 모양이 있다.
	

	private int[] card = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
	
	public void card() {
		
		for (int i =0; i < card.length; i++ ) {
			
			int number = card[i] % 13 + 1;
			if ( number == 1) {
				System.out.println("card number " + card[i] + "," + "A");
			} else if ( number == 11) {
				System.out.println("card number " + card[i] + "," + "J");
			} else if (number == 12) {
				System.out.println("card number " + card[i] + "," + "Q");
			} else if ( number == 13) {
				System.out.println("card number " + card[i] + "," + "K");
			} else {
				System.out.println("card number " + card[i] + "," + number);
			}
			
			
			int pic = card[i] / 13;
			
			if (pic == 0) {
				System.out.println(", 스페이드");
			} else if ( pic == 1) {
				System.out.println(", 다이아");
			} else if ( pic == 2) {
				System.out.println(", 하트 ");
			} else if ( pic == 3) {
				System.out.println(", 클로버");
			}
			
			
		}
	}
	
	
	
	
	
}
