
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        methodArrays (3,5);
//		methodIteration (2, 3);            		
	}

	
//String a = "Hello World!";                     //assignment

//System.out.println(a);

	
	
public static int methodName(int a, int b, boolean c){   
	if (c == true){
		return a + b;
	
	}
	else {
			return a * b;
	}
				
	}

public static int methodName3(int a, int b){  //task 7
	
if (a == 0){
	return b;
	}
 else {
		return a;
	}
}
public static void methodArrays(int a, int b){
	
	int[] arrayOfInts = {1,2,3,4,5,6,7,8,9,10};
	
	for (int i = 0; i < 10; i++)
	{
		System.out.println(methodName3(arrayOfInts[i], b));
	}

}
	
//
//	public static void methodIteration(int a, int b){
//		for (int i = 0; i < 10; i++)
//	{
//		System.out.println(methodName(i, b));
//	}
//		
//	}


	
	
}

