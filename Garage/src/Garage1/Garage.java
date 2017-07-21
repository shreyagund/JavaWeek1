package Garage1;
import java.util.*;

public class Garage {


	
public static void main(String[] args) {
		
	ArrayList<Vehicle> VehicleList = new ArrayList <>();
	
	Car v1 = new Car(1," Car ", true, " Blue ", 5, " Audi");
	Car v2 = new Car(2, " Car ", true, " Black ", 3, " Robin Reliant");
	Motorcycle v3 = new Motorcycle(3, " Motorcycle ", false, " Blue ", 125, true);
	Motorcycle v4 = new Motorcycle(4," Motorcycle ", false, " Blue ", 130, false);
	Bus v5 = new Bus(5, " Bus ", true, " Red ", false, 34);
	Bus v6 = new Bus(6, " Bus ", true, " Multi-coloured ", true, 72);
	
	
	VehicleList.add(v1);
	VehicleList.add(v2);
	VehicleList.add(v3);
	VehicleList.add(v4);
	VehicleList.add(v5);
	VehicleList.add(v6);
	
	// to get the price next to the above attributes
	
	for (int i = 0; i < VehicleList.size(); i++){
		System.out.println(VehicleList.get(i) + (VehicleList.get(i).type + VehicleList.get(i).calculateBill()));
	
	}
	
// to get the price separately for each vehicle
//for (int i = 0; i < VehicleList.size(); i++){
//	System.out.println(VehicleList.get(i).type + VehicleList.get(i).calculateBill());
//
//}

	
	
}



}
