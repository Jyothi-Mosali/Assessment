package assessment;
import java.util.ArrayList;

public class Airport 
{
	Address address;
	ArrayList<Flight> flights;
	ArrayList<Traveller> travellers;
	public Airport() {}
	public Airport(Address address, ArrayList<Flight> flights, ArrayList<Traveller> travellers) {
		this.address = address;
		this.flights = flights;
		this.travellers = travellers;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	public void setFlights(ArrayList<Flight> flights) {
		this.flights = flights;
	}
	public ArrayList<Traveller> getTravellers() {
		return travellers;
	}
	public void setTravellers(ArrayList<Traveller> travellers) {
		this.travellers = travellers;
	}
	
	public boolean addFlight(Flight flight)
	{
		if(flights.contains(flight)==false)
		{
			flights.add(flight);
			if(flights.contains(flight))
				return true;
		}
		return false;
	}
	public ArrayList<Flight> searchFlightBySourceAndDestination(String source,String Destination)
	{
		ArrayList<Flight> temp = new ArrayList<>();
		
		for(Flight f : flights)
		{
			if(f.getSource()==source && f.getDestination()==Destination)
			{
				temp.add(f);
			}
		}
		return temp;
	}
	public void bookTicket(String flightId, Traveller traveller)
	{
		int flag = 0;
		for(Flight f : flights)
		{
			if(f.getId()==flightId && f.getAvailableSeats()!=0)
			{
				flag = 1;
				f.setAvailableSeats(f.getAvailableSeats()-1);
				System.out.println("Ticket has been booked");
				break;
			}
		}
		if(flag == 1)
		{
			travellers.add(traveller);
		}
		
	}
	
}
