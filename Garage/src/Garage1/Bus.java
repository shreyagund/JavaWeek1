package Garage1;
public class Bus extends Vehicle{

	
	

	boolean doubleDecker;
	int numSeats;
	
	
	
	
public Bus (int idNo, String t, boolean hd, String c, boolean dd, int ns){  //from vehicle class
		super(idNo, t, hd, c);
		doubleDecker = dd;
		numSeats = ns;
		

		}


public String calculateBill(){
	return  " Price is £ " + 250;
}

	public String toString(){
		return idNo + type + hasDoors + colour + doubleDecker +numSeats;
	}


}
