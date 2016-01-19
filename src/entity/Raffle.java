package entity;

public class Raffle {
	/*
	 * raffle_id -> auto increment on DB value -> to uniquely identify each
	 * raffle -> Ex: 1
	 */
	int raffle_id;
	/*
	 * raffle_no -> to identify raffle number which is used to evaluate winner
	 * Ex: 9864563782
	 */
	int raffle_no;
	/* Starting date and time */
	String start_time;
	/* Ending date and time */
	String end_time;
	/* Maximum price for this raffle */
	double max_price;
	/* Minimum price for this raffle */
	double min_price;

	public Raffle(int raffle_id, int raffle_no, String start_time, String end_time, double max_price,
			double min_price) {
		this.raffle_id = raffle_id;
		this.raffle_no = raffle_no;
		this.start_time = start_time;
		this.end_time = end_time;
		this.max_price = max_price;
		this.min_price = min_price;
	}

	public int getRaffle_id() {
		return raffle_id;
	}

	public void setRaffle_id(int raffle_id) {
		this.raffle_id = raffle_id;
	}

	public int getRaffle_no() {
		return raffle_no;
	}

	public void setRaffle_no(int raffle_no) {
		this.raffle_no = raffle_no;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public double getMax_price() {
		return max_price;
	}

	public void setMax_price(double max_price) {
		this.max_price = max_price;
	}

	public double getMin_price() {
		return min_price;
	}

	public void setMin_price(double min_price) {
		this.min_price = min_price;
	}
}
