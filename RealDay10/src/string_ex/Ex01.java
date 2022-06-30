package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		
		
		// String 변수에 값 저장하기
		//연습
		String name = "Hello World";
		String name1 = "3";
		int a = Integer.valueOf(name1);
		System.out.println(a);
		
		
		
		//String 변수에 값 저장하기
		String aa = "안녕하세요";
		String bb = new String("안녕하세요");
		String cc = new String("안녕하세요");
		String dd = "안녕하세요";
		
		
		
		// == 으로 비교하는 것은 stack 영역에 저장된 주소값을 비교하는 것
		System.out.println(aa == dd); // true 
		System.out.println(bb == cc); // false = > new 생성자는 각각의 주소값이 생성됨.
		System.out.println(aa == bb); // false 
		
		//String에서 값 비교는 .equals() 사용
		
		System.out.println(bb.equals(dd)); // true 
		System.out.println(aa.equals(bb)); // true
		System.out.println(bb.equals(cc)); // true
		
		
		
	}

}
