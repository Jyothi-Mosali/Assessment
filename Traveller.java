package assessment;
import java.time.LocalDate;

public class Traveller 
{
	private String name;
	private String mobileNumber;
	private String email;
	private String flightId;
	private LocalDate date;
	public Traveller() {}
	public Traveller(String name, String mobileNumber, String email, String flightId, LocalDate date) 
	{
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.flightId = flightId;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
