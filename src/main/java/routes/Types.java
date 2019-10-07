package routes;

public class Types {
	
	private int id;
	private String description;
	private String transport;
	private double cost_km;
	
	public Types(int id, String description, String transport, double cost_km) {
		
		this.id = id;
		this.description = description;
		this.transport = transport;
		this.cost_km = cost_km;
	}
	
	public int getID() {
		
		return id;
	}
	
	public void setID(int id) {
		
		this.id = id;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	public String getTransport() {
		
		return transport;
	}
	
	public void setTransport(String transport) {
		
		this.transport = transport;
	}
	
	public double getCostPerKM() {
		
		return cost_km;
	}
	
	public void setCostPerKM(double cost_km) {
		
		this.cost_km = cost_km;
	}
	
	@Override
	public String toString() {
		
		return id + " " + description + " " + transport + " " + cost_km;
	}

}
