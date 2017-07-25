package paint2;

public class CheapoMax2 extends Paint {

	
	
	
	public CheapoMax2(String name, double roomSize, double costPerTin, int coveragePerTin) {
		super(name, roomSize, costPerTin, coveragePerTin);
		// TODO Auto-generated constructor stub
	}

	
	
	public String toString(){
		return super.toString() + " Name: " + this.name + " Room Size: " + this.roomSize + " Cost per tin: £" + this.costPerTin + " Coverage per tin " + this.coveragePerTin;
		}
	
	
	
	
}
