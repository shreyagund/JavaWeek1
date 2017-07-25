package files;



public class Main {

	public static void main(String[] args) {
	
		MakePerson mp = new MakePerson();
		
		
		
		Person p1 = new Person("Shreya ", "Trainee Consultant ", 21);
		Person p2 = new Person("Shreya ", "Trainee Consultant ", 21);
		Person p3 = new Person("Shreya ", "Trainee Consultant ", 21);
		Person p4 = new Person("Shreya ", "Trainee Consultant ", 21);
		Person p5 = new Person("Shreya ", "Trainee Consultant ", 21);
		
		
		
	mp.addpeople(p1);
	mp.addpeople(p2);
    mp.addpeople(p3);
    mp.addpeople(p4);
	mp.addpeople(p5);
	mp.writeToFile();
		
	}
}

