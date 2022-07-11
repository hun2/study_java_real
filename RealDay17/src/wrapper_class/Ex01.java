package wrapper_class;

public class Ex01 {

	public static void main(String[] args) {
		
		// 1. 기본 자료형 (primitive type) 저장하기
		int n1 = 5;
		System.out.println(n1);
		
		// 2. 래퍼 클래스 (wrapper class) 에 값 저장하기
		Integer n2 = 5;
		System.out.println(n2);
		
		
		//3. 래퍼 클래스 객체를 만들어 값 저장하기
		Integer n3 =  new Integer(5); // deprecated 앞으로 안쓰는게 좋음. 없어질 메소드
		System.out.println(n3);
		
		
		// 한쪽이 기본 자료형이면 값끼리 비교가 된다.
		System.out.println(n1 == n2); // n1이 기본자료형이기에 true
		System.out.println(n1 == n3);
		System.out.println(n2.equals(n3));
		System.out.println(n2.equals(n1));
		System.out.println(n2==n3); // 주소값이 다르다. 즉 다름으로 나옴
		
	}

}
