package interface_quiz01;

public class EntertainerApplicant implements actorAudition,idolAudition{

	
	
	@Override
	public void sing() {
		System.out.println("랄랄랄");
	}
	
	@Override
	public void Act() {
		System.out.println("예옝예");
	}
	
}
