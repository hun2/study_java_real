package class_quiz05;

public class Test {

	public static void main(String[] args) {
		
		
		int[] real = new int[] {10,17,22,28,36};
		
		//setter 로 수동 로또번호 값가져오는 방법
		Lotto lotto = new Lotto();
		lotto.setLotto(real);
		
		//생성자 파라미터로 수동 로또 번호 가져오는 방법
		Lotto lotto1 = new Lotto(real);
		
		//자동 로또번호 가져오는 방법
		Lotto lotto2 = new Lotto();
		lotto2.auto();
		
		
		
		LottoChecker checker = new LottoChecker();
		checker.reallotto();
		checker.resultPrint(lotto);
		checker.resultPrint(lotto1);
		checker.resultPrint(lotto2);
		
		
		
	}

}
