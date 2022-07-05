package class_quiz04;

public class OmrCardTest {

	public static void main(String[] args) {
		
		
		OmrCard omrcard = new OmrCard();
		omrcard.setName("김기훈");
		omrcard.setNumber(20200302);
		omrcard.setAnwser(3,2,5,1,4);
		
		
		OmrCardReader reader = new OmrCardReader();
		reader.printScore(omrcard);
		
		
		
	}

}
