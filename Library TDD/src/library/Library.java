package library;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Library {


	ArrayList <Items> ListOfItems = new ArrayList <Items> ();

	
	public Items i; //declaring item
	
	
	////add items
	
	public void addItems (Items i)
    {
		ListOfItems.add(i);
		
    }
	
	
	////show items
	
	public void showItems()
	{
		for (Items i : ListOfItems)   
		{
		System.out.println(i);
		}
	}

	
	////remove item
	
	public void removeItems(int iD)
	{
		
		for (int i = 0; i < ListOfItems.size(); i++)
		{
			if (ListOfItems.get(i).iD == iD)
			{
		
		ListOfItems.remove(i);
		System.out.println(ListOfItems);
			}
	
	
		}
	}
	

	////update item
	
	public void updateItems(String name, String type, int iD)
	{
		System.out.println("Updating Item: " + ListOfItems.get(iD).name);
		ListOfItems.get(iD).name = name;
		System.out.println("Updated to: " + ListOfItems.get(iD).name);
		
		
	}
		
		
	////check out item/////need to remove it from list when withdrawn
	
	public void checkOutItem(String name, String type, int iD){
	
			System.out.println("Checking out item: " + ListOfItems.get(iD).name + ListOfItems.get(iD).type + ListOfItems.get(iD).iD);
			ListOfItems.get(iD).name = name;
			ListOfItems.get(iD).type = type;
			ListOfItems.get(iD).iD = iD;
			System.out.println("Successfully checked out: " + ListOfItems.get(iD).name+ ListOfItems.get(iD).type + ListOfItems.get(iD).iD);
		
			
		
		
	}
	
	
	////check in item
	
	public void checkInItem(String name){
	
		for (Items i : ListOfItems){
			
			if(name.equals("name")  && i instanceof Items){
				
				i.checkedIn = false;
				System.out.println("This item has not been checked in: " );
				
			}
			
			else{
			
				i.checkedIn = true;
					System.out.println("Checked in "+ name);
			}
		}
		
		
	}

	
	
	public void writeToFile(){
		
	{
        
    try 
    {
    	PrintWriter pw = new PrintWriter (new FileOutputStream("Library System.txt"));
    	for( Items Items : ListOfItems);
    	pw.println(ListOfItems);
    	pw.close();
    	System.out.println(ListOfItems);
    	}
    catch (Exception e)
    	{
    	e.printStackTrace();
    	}
   
    }
	
	
}
	
	
//	public void retrieveFile() throws IOException{
//		
//		InputStream inputStream = ListOfItems.class.getResourceAsStream("Library.txt");
//		
//		BufferedReader file = new BufferedReader(new FileReader(Library.txt));
//		file.readLine();
//		file.close();
//		
//		
//		BufferedReader br = null;
//		FileReader fr = null;
//		
//	}
	
///////MEMBER////////
	
	
	
	
	
ArrayList <Member> MemberList = new ArrayList <Member> ();

	
	public Member m;  //declaring member
	

	////add member
	
	public void addMember (Member m)
    {
		MemberList.add(m);
		
    }
	

	////show member

	public void showMember() {
		
		for (Member m : MemberList)   
		{
		System.out.println(m);
		}
	}
	
	
	////remove member
	
	public void removeMember(int memberID)
	{
		
		for (int i = 0; i < MemberList.size(); i++)
		{
			if (MemberList.get(i).memberID == memberID)
			{
		
		MemberList.remove(i);
		System.out.println(MemberList);
			}
	
	
		}
	}


	////update member
	
	public void updateMember(String name, int age, int memberID)
	{
		System.out.println("Updating Member: " + MemberList.get(memberID).memberID);
		MemberList.get(memberID).memberID = memberID;
		System.out.println("Updated to: " + MemberList.get(memberID).memberID);
		
		
	}

	
}