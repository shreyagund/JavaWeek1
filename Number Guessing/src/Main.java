import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		userInterface();
	}

	public static void userInterface() {
		int u2 =0;
		int turns = 0;

		int number = (int) (100 * Math.random()) + 1;
		System.out.println(number);

		while (u2 != number) {
			

			System.out.println("Please enter a number: ");
			Scanner input = new Scanner(System.in);
			u2 = input.nextInt();

			// System.out.println("You Entered: " + u);
			turns = 1 + turns;

			if (u2 < number) {

				if (number - u2 < 5) {
					System.out.println("Too low, you're super hot");

				}

				else if (number - u2 < 10) {
					System.out.println("Too low, you're warm");
				}

				else if (number - u2 < 15) {
					System.out.println("Too low you're cold");

				}

				else if (number - u2 < 20) {
					System.out.println("Too low you're freezing cold");

				}
				
				
		

			}
			
			else{
				System.out.println("Too Low, you are way off");
			}

			 
			
			if (u2 > number) {

				if (u2 - number > 5) {
					System.out.println("Too high, you're super hot");

				}

				else if (u2 - number > 10) {
					System.out.println("Too high you're warm");
				}

				else if (u2 - number > 15) {
					System.out.println("Too high you're cold");

				}

				else if (u2 - number > 20) {
					System.out.println("Too high you're freezing cold");
				}

			}
			
			else{
				System.out.println("Too high, you are way off");
			}
			 
			 
			 

	

		}
		

		System.out.println("Well done! You've guessed it right in " + turns + " turns");

		
		
		

	}



}
