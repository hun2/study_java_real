package class_quiz03;

public class ProductTest {

	public static void main(String[] args) {
		
		//오늘 날짜는 2022월 7월 5일
		
		Product product = new Product("새우깡", 1300, "2022-06-04");
		product.price(5);
		product.price(13);
		System.out.println(product.avaiable());
		
		
		Product product1 = new Product("홈런볼", 1500, "2023-07-05");
		product1.price(5);
		product1.price(13);
		System.out.println(product1.avaiable());
		
		
		Product product2 = new Product("포카칩", 2500, "2021-12-25");
		product2.price(5);
		product2.price(13);
		System.out.println(product2.avaiable());
		
		
		
		
		
		
		
	}

}
