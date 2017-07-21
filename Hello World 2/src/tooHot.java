
public class tooHot {

	public static void main(String[] args) {
		
		System.out.println(tooHot(17, true));

	}

public static boolean tooHot(int temperature, boolean isSummer){
	
	if (isSummer == true && temperature > 60 && temperature < 100){
		return true;
	}
		
	else if (isSummer == false && temperature > 60 && temperature < 90){
		return true; 
	}
	
	else{
		return false;
	}
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
