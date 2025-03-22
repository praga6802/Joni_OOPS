//super class - parent class


public class Vehicle{
	int vehiclemaxspeed;
	String vehiclename;

	Vehicle(String vehiclename, int vehiclemaxspeed){
		this.vehiclename=vehiclename;
		this.vehiclemaxspeed=vehiclemaxspeed;
	}
	
	public void moveCar(){
		System.out.println("Vehicle is moving");
	}

	public void disp(){
		System.out.println("Vehicle Name:"+vehiclename);
	}

}

	