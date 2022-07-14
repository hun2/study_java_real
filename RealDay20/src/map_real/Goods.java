package map_real;

public class Goods {

	
	private String name;
	private String cost;
	private String possible;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}


	public String getPossible() {
		return possible;
	}


	public void setPossible(String possible) {
		this.possible = possible;
	}
	
	@Override
	public String toString() {
		return "물품명 :" + name + ", 가격 " + cost + ", 판매상태 :" + possible;
	}
	
	
	
	
	
	
	
}
