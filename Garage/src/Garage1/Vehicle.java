package Garage1;
//import java.util.ArrayList;
public class Vehicle {

		int idNo;
		String type;
		boolean hasDoors;
		String colour;
				
	public Vehicle(int idNo, String t, boolean hd, String c){
		
		this.idNo = idNo;
		type = t;
		hasDoors = hd;
		colour = c;
	}

		public String toString(){
			return idNo+ type + hasDoors + colour; 
		}
	
			// make method here for bill with return for all vehicles, car, bus, etc and change price for each
		public String calculateBill(){
			return  " Price is £ " + 200;
				
		}
		
		public int multiply(int value){
			return this.multiply(value*5);
		}
		
		//method to add a vehicle
//		public String addVehicle(){
//			
//		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
}
