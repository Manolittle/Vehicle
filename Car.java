package myprojects;

 public class Car extends Vehicle{
    private int numDoors;

	public Car(String model, String make, int year, int numDoors) {
		super(model, year, make);
		this.numDoors = numDoors;
	}

	

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
    
	public void display() {
		System.out.println("Car Details :");
		super.display();
		
	}
}
