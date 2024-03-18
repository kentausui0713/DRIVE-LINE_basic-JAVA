package vehicle_owner;

public class Vehicle {
	private String owner;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
}

class Car extends Vehicle{
	
}

class Bicycle extends Vehicle{
	
}