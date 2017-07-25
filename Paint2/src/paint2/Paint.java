package paint2;

public class Paint {

	
	String name;
	double roomSize;
	double costPerTin;
	int coveragePerTin;
	
	
	public Paint(String name, double roomSize, double costPerTin, int coveragePerTin) {
		super();
		this.name = name;
		this.roomSize = roomSize;
		this.costPerTin = costPerTin;
		this.coveragePerTin = coveragePerTin;
	}

	
	public String toString(){
		return name + roomSize + costPerTin + coveragePerTin; 
	}
	
	
	
//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}


