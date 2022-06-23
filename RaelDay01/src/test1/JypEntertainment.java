package test1;

public class JypEntertainment implements EntertainerApplicant {

	@Override
	public String actorAudition(String a) {
		// TODO Auto-generated method stub
		return "연기 오디션" + a + "진행";
	}

	@Override
	public String idolAudition(String a) {
		// TODO Auto-generated method stub
		return "아이돌 오디션" + a + "진행";
	}

}
