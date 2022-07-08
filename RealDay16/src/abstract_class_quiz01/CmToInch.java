package abstract_class_quiz01;

public class CmToInch extends Converter {

	@Override
	protected void printConverted() {
		System.out.println(this.result + "inch");
	}
	
	public CmToInch() {
		this.ratio = 0.393701;
	}
	
}
