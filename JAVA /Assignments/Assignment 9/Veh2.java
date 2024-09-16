package org.co.bank;
class Vehic {
	public void startEngine() {
		System.out.println(" Engine is starting");
	}

	public void stopEngine() {
		System.out.println(" Engine has stopped ");
	}
}

class Cars extends Vehic {
	@Override
	public void startEngine() {
		System.out.println(" Engine is starting in car");
	}

	@Override
	public void stopEngine() {
		System.out.println(" Engine has stopped in car ");
	}
}

class Motorcycle extends Vehic {
	@Override
	public void startEngine() {
		System.out.println(" Engine is starting in motorcycle");
	}

	@Override
	public void stopEngine() {
		System.out.println(" engine has stopped in motorcycle ");
	}
}

public class Veh2 {
	public static void main(String[] args) {
		Vehic v = new Cars();
		v.startEngine();
		v.stopEngine();
		v = new Motorcycle();
		v.startEngine();
		v.stopEngine();
		}

}
//Engine is starting in car
//Engine has stopped in car 
//Engine is starting in motorcycle
//engine has stopped in motorcycle 

