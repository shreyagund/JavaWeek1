package Garage1;
public class Motorcycle extends Vehicle{

	
	

	int engineSize;
	boolean hasStorage;
	
	
	
	
public Motorcycle(int idNo, String t, boolean hd, String c, int es, boolean hs){  //from vehicle class
		super(idNo, t, hd, c);
		engineSize = es;
		hasStorage = hs;
		

		}


public String calculateBill(){
	return  " Price is £ " + 200;
}

	public String toString(){
		return idNo + type+ hasDoors + colour + engineSize + hasStorage;
	}


}
