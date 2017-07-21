
public class Main {

	public static void main(String[] args) {

		factorialx(120);

	}

	public static void factorialx(int number) {

		int n = 1;
		int numberz = 0;
		int numbery = number;

		while (numbery / n != 1) {

			if (numbery % (numbery / n) != 0) {

				// System.out.println("None");
				numberz = 1;
				break;

			}

			else {

				numbery = numbery / n;

				n++;

			}

		}

		if (numberz == 0) {
			System.out.println(numbery);
		}

		else {
			System.out.println("None");
		}
	}

}
