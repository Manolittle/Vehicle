package myprojects;

public class Vehicle {
	  private String model;
	  private int year;
	  private String make;
	public Vehicle(String model, int year, String make) {
		super();
		this.model = model;
		this.year = year;
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
		
		
		
			
		}


	public  void display() {
		// TODO Auto-generated method stub
		System.out.println("Model :" + getModel());
		System.out.println("Make  :" + getMake());
		System.out.println("Year  :" + getYear());
		System.out.println("-----------------------------");
	}
	}