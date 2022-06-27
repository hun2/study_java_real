package function_ex;

public class Ex02 {

	
	
	public static int sum(int a, int b ) {
		int result = a + b;
		return result;
	}
	
	public static void sum2(int a, int b) {
		System.out.println(a + b);
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world");
		System.out.println("Hello world");
		return; // void 타입의 형은 return을 쓰게된다면 메소드가 종료된다.
		
	}
	
	
	public static void main(String[] args) {
		
		
		//메소드 만들기 
		//1. 어떤 함수(메소드)를 만들건지 명칭을 짓는다. 
		//2. input을 뭘로 받을 지 생각한다. (Argument)
		//3. output을 무엇으로 돌려줄지 생각한다. 
		//4. 구현한다.
		
		
		//메소드를 사용하는 곳
		//메소드 사용 : 메소드를 부른다. 메소드를 호출한다. call한다.
		
		int x = 15;
		int y = 30;
		
		int result = sum(x , y );
		sum2(x,y);
		System.out.println(result);
		System.out.println(sum(x,y));
		printHelloWorld();
		
		
		
		
		
		
		// static : 정적. 동적의 반대 static 메소드가 다른 메소드를 부르는 경우 
		// 메모리에 없으면 참조할 수 없기 때문에 static으로 정의한다.
		
		
	}

}
