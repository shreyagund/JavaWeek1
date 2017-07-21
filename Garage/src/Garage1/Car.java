package Garage1;
public class Car extends Vehicle{

	
	

	int numDoors;
	String model;
	
	
	
	
public Car(int idNo, String t, boolean hd, String c, int numDoors, String model){  //from vehicle class
		super(idNo, t, hd, c);
		this.numDoors = numDoors;
		this.model = model;
		

		}

public String calculateBill(){
	return  " Price is £ " + 210;
}


	public String toString(){
		return idNo + type + hasDoors + colour + numDoors + model;
	}


}
