
public class HelloWorld2 {

	public static void main(String[] args) {
		
	System.out.println(blackJack(5, 20));
	}
public static int blackJack (int a, int b){
	
	if (b > a && b < 21){		
	return b;
	}
	else if (a > b && a < 21){
		return a;
	}
	else if (a > 21 && b > 21){
		return 0;
	}
	else if (a > 21 || b > 21){
		return 0;
	}
	
	else
		return b;
	}

}

