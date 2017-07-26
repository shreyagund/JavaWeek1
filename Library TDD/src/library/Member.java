package library;

public class Member extends Library {


	
	 String memberName;
	 int age;
	 int memberID;
	
	
	
	public Member(String memberName, int age, int memberID) {
		super();
		this.memberName = memberName;
		this.age = age;
		this.memberID = memberID;
	}
	
	
	
	public String toString()
	{
		
		return "Name: " + memberName + " Age: " + age + " Member ID: " + memberID;
		
	}
	
	

}
