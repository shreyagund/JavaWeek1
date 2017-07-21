import java.util.ArrayList;

public class People {

	String name;
	int age;
	String jobTitle;
	
static ArrayList <People> People = new ArrayList<People>();	
	
	
public People(String n, int a, String j){
	
	name = n;
	age = a;
	jobTitle = j;

	}
	
	public String toString(){
		return name + age + jobTitle;
	}

	public static void main(String[] args) {
		
		People p1 = new People("Shreya ", 21, " Trainee Consultant");
		People p2 = new People("Shreya ", 21, " Trainee Consultant");
		People p3 = new People("Shreya ", 21, " Trainee Consultant");
		People p4 = new People("Shreya ", 21, " Trainee Consultant");
		
		
		People.add(p1);
		People.add(p2);
		People.add(p3);
		People.add(p4);
	
		
		for (People p: People){
			System.out.println(p.toString());
		}
	
	}
	
	
	
}