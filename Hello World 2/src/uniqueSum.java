
public class uniqueSum {

	public static void main(String[] args) {
		
		System.out.println(uniqueSum(3,3,8));

	}

public static int uniqueSum(int a, int b, int c){   
		
	if (a != b && b !=c){
		return a + b + c;
	}
	
	else if (a != b && b == c){
		return a;
		}
	else if (a == b && b!= c){
		return c;
	}
	
	else
		return b;
	
	}

}
	

