package class_ex02;

public class Ex01 {
	//나의 의식, 코드의 흐름
	public static void main(String[] args) {
		
		
		
		Cellphone phone = new Cellphone();
		phone.color = "스틸그레이";
		phone.maker = "삼성";
		phone.model = "아이폰13 pro max";
		phone.price = 1500;
		
		phone.call();
		phone.camera();
		System.out.println(phone.color);
		System.out.println(phone.maker);
		System.out.println(phone.model);
		System.out.println(phone.price);
		
		
		phone.color = "아무색이나";
		System.out.println(phone.color);
	}

}
