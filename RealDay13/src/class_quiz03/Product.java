package class_quiz03;

public class Product {

	String product;	
	int price;
	String limit;
	
	
	public Product(String product, int price, String limit) {
		this.product = product;
		this.price = price;
		this.limit = limit;
		
		System.out.println("이름 : " + this.product);
		System.out.println("가격 : " + this.price);
		System.out.println("유통기한 : " + this.limit);
		
	}
	
	
	public void price ( int a) {
		int b = this.price * a;
		System.out.println("제품 " + a + "개의 가격 : " + b + "원");
	}
	
	
	public String avaiable () {
		
		String[] umm = limit.split("-");
		int year = Integer.parseInt(umm[0]);
		int month = Integer.parseInt(umm[1]);
		int day = Integer.parseInt(umm[2]);
		
		if (year <= 2021) {
			return "※※※※※판매 불가 상품※※※※※";
		} else if ( year <= 2022 && month > 7) {
			return "※※※※※※판매 불가 상품※※※※※※";
		} else if ( year <= 2022 && month <= 7 && day < 5) {
			return "※※※※※※판매 불가 상품※※※※※※";
		} else {
			return "판매 가능 상품";
		}
		
		
		
		
	}
	
}
