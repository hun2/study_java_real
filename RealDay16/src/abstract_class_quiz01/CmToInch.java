package abstract_class_quiz01;

public class CmToInch extends Converter {

	@Override
	protected void printConverted() {
		System.out.println(result);
	}

	@Override
	 public void convert(int input) {
        this.result = input * 0.393701;
    } 
	
	
}
