package class_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
		
		
		OmrCard omrcard = new OmrCard();
		omrcard.setName("김기훈");
		omrcard.setNumber(20200302);
		omrcard.setAnwser(3,2,5,1,4);
		
		OmrCard omrcard1 = new OmrCard("테스트1", 20200303);
		omrcard1.setAnwser(2,1,3,4,1);
		
		OmrCard omrcard2 = new OmrCard("테스트2", 20200304);
		omrcard2.setAnwser(5,1,4,2,1);
		
		OmrCard omrcard3 = new OmrCard("테스트3", 20200305);
		omrcard3.setAnwser(1,2,3,3,5);
		
		
		OmrCardReader reader = new OmrCardReader();
		reader.printScore(omrcard);
		reader.printScore(omrcard1);
		reader.printScore(omrcard2);
		reader.printScore(omrcard3);
		
		OmrCardReader reader1 = new OmrCardReader(5,1,2,3,3);
		reader1.printScore1(omrcard3);
		
		
	}

}
