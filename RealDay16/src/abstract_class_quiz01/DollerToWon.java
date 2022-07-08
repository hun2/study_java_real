package abstract_class_quiz01;

public class DollerToWon extends Converter{
	
	
	@Override
	protected void printConverted() {
		System.out.println((int)result);
	}
	
	public DollerToWon(int dollor) {
		this.ratio = dollor;
		
	}

	
	
	
	
	
}
