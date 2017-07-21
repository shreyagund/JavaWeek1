package Paint1;
import java.util.*;


public class Wizard {

	public static void main(String[] args) {
		
		ArrayList<Paint> PaintList = new ArrayList <>();

		
		CheapoMax p1 = new CheapoMax("CheapoMax", 20  , 10 , 19.99);
		AverageJoes p2 = new AverageJoes("Average Joes", 15, 11, 17.99);
		DuluxourousPaints p3 = new DuluxourousPaints("Duluxourous Paints", 10, 20, 25.00);
		
		PaintList.add(p1);
		PaintList.add(p2);
		PaintList.add(p3);
		
		
	//	public void price(){
			
		//}
		
		
		for (int i = 0; i < PaintList.size(); i++){
			System.out.println(PaintList.get(i) + (PaintList.get(i).name));
		
		}
		
		
	}
	
	
	
}
