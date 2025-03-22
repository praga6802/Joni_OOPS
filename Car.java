//sub class - child class


public class Car extends Vehicle{
	
	int carmaxspeed;
	String carname;

	Car(String vehiclename, int vehiclemaxspeed, String carname, int carmaxspeed){
		super(vehiclename, vehiclemaxspeed); //calling parent class constructor using super keyword
		this.carname=carname;
		this.carmaxspeed=carmaxspeed;
	}

	public void disp(){
		System.out.println("Vehicle Class");
		System.out.println("Vehicle name: "+super.vehiclename);
		super.moveCar(); //accessing parent class method using super keyword
		System.out.println("Vehicle Max speed: "+super.vehiclemaxspeed+" km/hr"); //accessing parent class variable using super keyword
		System.out.println();

		System.out.println("Car Class");
		System.out.println("Car name: "+carname);
		moveCar();
		System.out.println("Car max speed:"+carmaxspeed+" km/hr");
	}

	public void moveCar(){
		System.out.println("Car is moving");
	}


	public static void main(String[] args){
		Car c1= new Car("Vehicle",120,"Audi",190);
		c1.disp();
	}
}

