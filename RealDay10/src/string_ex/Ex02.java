package string_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		//자료형을 변환
		int c = 5;
		String d = String.valueOf(c);
		System.out.println(d);
		
		//문자열 = > 숫자
		String a = "3";
		int b = Integer.valueOf(a);
		b = Integer.parseInt(a);
		System.out.println(b);
		
		
		
		//int double char ... 기본자료형 (primitive Type)
		//String , new 클래스들, int[] ....배열 등등....참조자료형(Reference Type)
		
		
		String s1 = "eclipse";
		
		// charAt : n번째 인덱스의 무슨 인자가 있는지 확인 메소드
		
		System.out.println("charAt: " + s1.charAt(0));
		
		// contains : 특정 문자열이 문자열에 포함되어 있는지 확인 메소드
		
		System.out.println("contains: " + s1.contains("p"));
		
		
		//startsWith : 특정 문자열로 시작하는지 확인 메소드
		System.out.println("startswith : " + s1.startsWith("e"));
		
		
		//endsWith : 특정 문자열로 끝나는지 확인 메소드
		System.out.println("endsWith :" + s1.endsWith("e"));
		
		// length : 문자열의 길이를 확인. 알파벳이 몇개인지 확인하는 메소드
		System.out.println("length:" + s1.length());
		
		// replace : 포함된 문자열 부분을 교체 하는 메소드
		
		String s2 = "내가 지금 먹고 싶은 것은 치킨이다.";
		s2 = s2.replace("치킨", "떡볶이");
		System.out.println(s2);
		
		
		//split :특정 스트링을 기준으로 잘라서 배열에 넣는다.
		String s3 =  "apple,melon,grape";
		String[] fruits = s3.split(",");
		
		for ( int i =0; i <fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		//substring : 문자열을 자른다. 
		String s4 = "javastudy";
		
		System.out.println(s4.substring(4));
		System.out.println(s4.substring(0, 4));
		System.out.println(s4.substring(4, 9));
		
		
		
	}

}
