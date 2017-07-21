package Paint1;

public class Paint {

	
	String name;
	int quantity;
	int coveragePerLitre;
	//static double costPerLitre;
	double cost;
	
	public Paint(String name, int quantity, int coveragePerLitre, double cost){
		this.name = name;
		this.quantity = quantity;
		this.coveragePerLitre = coveragePerLitre;
		this.cost = cost;
		//this.costPerLitre = costPerLitre;
		
	}
	
	public String toString(){
		return name + quantity + coveragePerLitre + cost; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	
}
		

