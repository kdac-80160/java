package tester;

import com.app.vehicles.Vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle();
		vehicle1.acceptData();
		Vehicle vehicle2 = new Vehicle();
		vehicle2.acceptData();
		
		if(vehicle1.equals(vehicle2))
			System.out.println("SAME");
		else
			System.out.println("DIFFERENT");

	}

}
