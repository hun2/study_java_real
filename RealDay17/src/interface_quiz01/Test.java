package interface_quiz01;

public class Test {

	public static void main(String[] args) {
		
		 // 지원자
	    EntertainerApplicant kihun = new EntertainerApplicant();

	    // 지원할 곳 (JYP)
	    JypEntertainment jyp = new JypEntertainment();
	    jyp.actorAudition(kihun);
	    jyp.idolAudition(kihun);
		
		
	}

}
