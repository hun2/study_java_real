package interface_Ex01;


// 취준생
public class JobApplicant implements CProgramming, JavaProgramming{

	
	//필드 ( 스펙)
	private int toeic;
	private double gradePoint;
	private String[] licenses;
	
	//자기소개메소드
	public String introduce() {
		return "저는 서울에서 태어나 개졸려요";
	}

	@Override
	public void procedure() {
		System.out.println("C는 절차지향 언어이고, 졸리고,,,,,,,,개졸리고,,,,,");
	}

	@Override
	public void objectOriented() {
		// TODO Auto-generated method stub
		
	}
	
	
	//getters, setters....
	
}
