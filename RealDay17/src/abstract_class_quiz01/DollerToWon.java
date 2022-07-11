package abstract_class_quiz01;

public class DollerToWon extends Converter {

	
	public DollerToWon (double number) {
		super.ratio = number;
	}
	
	
	
	@Override
	protected void printConverted() {
		
		
		System.out.println((int)this.result + "원");
	}

	
}
