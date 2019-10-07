package routes;

public class Routes {
	
	private int id;
	private String init_city;
	private String dest_city;
	private String init_date;
	private String end_date;
	private float distance;
	private int travel_dur;
	private int type_ref;
	
	public Routes(int id, String init_city, String dest_city, String init_date, String end_date, float distance, int travel_dur) {
		
		this.id = id;
		this.init_city = init_city;
		this.dest_city = dest_city;
		this.init_date = init_date;
		this.end_date = end_date;
		this.distance = distance;
		this.travel_dur = travel_dur;
	}
	
	public int getID() {
		
		return id;
	}
	
	public void setID(int id) {
		
		this.id = id;
	}
	
	public String getInitCity() {
		
		return init_city;
	}
	
	public void setInitCity(String init_city) {
		
		this.init_city = init_city;
	}
	
	public String getDestCity() {
		
		return dest_city;
	}
	
	public void setDestCity(String dest_city) {
		
		this.dest_city = dest_city;
	}
	
	public String getInitDate() {
		
		return init_date;
	}
	
	public void setInitDate(String end_date) {
		
		this.end_date = end_date;
	}
	
	public String getEndDate() {
		
		return end_date;
	}
	
	public void setEndDate(String end_date) {
		
		this.end_date = end_date;
	}
	
	public float getDistance() {
		
		return distance;
	}
	
	public void setDistance(float distance) {
		
		this.distance = distance;
	}
	
	public int getTravelDuration() {
		
		return travel_dur;
	}
	
	public void setTravelDuration(int travel_dur) {
		
		this.travel_dur = travel_dur;
	}
	
	public int getTypeRef() {
		
		return type_ref;
	}
	
	public void setTypeRef(int type_ref) {
		
		this.type_ref = type_ref;
	}
	
	@Override
	public String toString() {
		
		return id + " " + init_city + " " + dest_city + " " + init_date + " " + end_date + " " +
				distance + " " + travel_dur;
	}
	
}
