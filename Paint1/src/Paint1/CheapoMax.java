package Paint1;

public class CheapoMax extends Paint {

	
	//double cost;
	
	
	
	public CheapoMax(String name, int quantity, int coveragePerLitre, double cost) {
		super(name, quantity, coveragePerLitre, cost);
		//this.cost = cost;
	}
	
	
	
	
	
//	public String priceperLitre(){
//		return  " Price per litre is £ " + (20/19.99);
//	}
//	
		
	public String toString(){
		return super.toString() + " Name: " + this.name + " Quantity: " + this.quantity + " Coverage: " + this.coveragePerLitre + " Cost: £" + this.cost;
		}
	
	
	
}
