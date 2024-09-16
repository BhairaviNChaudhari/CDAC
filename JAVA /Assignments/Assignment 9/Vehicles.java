package org.co.bank;

class Vehicles1 {
	String make;
	int year;

	public Vehicles1() {
		this(" ", 0);
	}

	public Vehicles1(String make, int year) {
		this.make = make;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public int getYear() {
		return year;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

class Car extends Vehicles1 {
	String model;

	public Car() {
	}

	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void printrec() {
		System.out.println("Make :" + this.getMake());
		System.out.println("Year :" + this.getYear());
		System.out.println("Model :" + this.getModel());
	}
}

public class Vehicles {
	public static void main(String[] args) {
		Car c = new Car("Tata", 2019 ,"Harrier");
		c.printrec();
		}


}
//Make :Tata
//Year :2019
//Model :Harrier

