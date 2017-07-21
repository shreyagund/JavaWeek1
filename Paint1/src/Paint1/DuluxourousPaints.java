package Paint1;

public class DuluxourousPaints extends Paint {

	                                                                             
			
			
	public DuluxourousPaints(String name, int quantity, int coveragePerLitre, double cost) {
		super(name, quantity, coveragePerLitre, cost);
	}
	
	
	
	
	public String priceperLitre(){
		return  " Price per litre is £ " + (15/17.99);
	}
	
	
	
//		public String toString(){
//		return name + quantity + coveragePerLitre + cost; 
//	}
//	
		public String toString(){
			return super.toString() + " Name: " + this.name + " Quantity: " + this.quantity + " Coverage: " + this.coveragePerLitre + " Cost: £" + this.cost;
			}
		
	
}
	
	
	
	
	
	
	
	
	

