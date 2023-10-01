package myprojects;

public class Motorcyle extends Vehicle  {
    private int topspeed;

	public Motorcyle(String model, int year, String make, int topspeed) {
		super(model, year, make);
		this.topspeed = topspeed;
	}

	public int getTopspeed() {
		return topspeed;
	}

	public void setTopspeed(int topspeed) {
		this.topspeed = topspeed;
	}


public void display() {
	System.out.println("Motorcyle Details :");
	super.display();
	
}
    

}
