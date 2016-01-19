package entity;

public class OrderDetails {
	int order_id;
	String order_date;
	int raffle_id;
	int user_id;

	public OrderDetails(int order_id, String order_date, int raffle_id, int user_id) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.raffle_id = raffle_id;
		this.user_id = user_id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public int getRaffle_id() {
		return raffle_id;
	}

	public void setRaffle_id(int raffle_id) {
		this.raffle_id = raffle_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

}
