package entity;

public class RaffleCampaign {
	int campaign_id;
	String campaign_name;
	String organizer_name;
	String contact_email;
	int raffle_count;

	public int getRaffle_count() {
		return raffle_count;
	}

	public RaffleCampaign(int campaign_id, String campaign_name, String organizer_name, String contact_email,
			int raffle_count) {
		super();
		this.campaign_id = campaign_id;
		this.campaign_name = campaign_name;
		this.organizer_name = organizer_name;
		this.contact_email = contact_email;
		this.raffle_count = raffle_count;
	}

	public void setRaffle_count(int raffle_count) {
		this.raffle_count = raffle_count;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	public int getCampaign_id() {
		return campaign_id;
	}

	public void setCampaign_id(int campaign_id) {
		this.campaign_id = campaign_id;
	}

	public String getCampaign_name() {
		return campaign_name;
	}

	public void setCampaign_name(String campaign_name) {
		this.campaign_name = campaign_name;
	}

	public String getOrganizer_name() {
		return organizer_name;
	}

	public void setOrganizer_name(String organizer_name) {
		this.organizer_name = organizer_name;
	}

}
