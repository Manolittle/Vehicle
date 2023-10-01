package myprojects;


	public class Main extends Vehicle{

		public Main(String model, int year, String make) {
			super(model, year, make);
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Car c1 = new Car("suzuki","shift", 2023, 4);
	     c1.display();
	    
	     Motorcyle m1  = new Motorcyle("Hero", 2020, "Logo", 400);
	     m1.display();
		}

	}