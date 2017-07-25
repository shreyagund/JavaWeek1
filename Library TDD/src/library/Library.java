package library;

import java.util.ArrayList;



public class Library {


	//static int iD = 0;
	
	
	ArrayList <Items> ListOfItems = new ArrayList <Items> ();

	
	
	public Items i;
	
	public void addItems (Items i)
    {
		ListOfItems.add(i);
		
    }
	
	

	public void showItems()
	{
		for (Items i : ListOfItems)   
		{
		System.out.println(i);
		}
	}
	
	
	public void removeItems()
	{
		
		for (int i = 0; i < ListOfItems.size(); i--);
	}
	
	
}


//	public void withdrawItems(){
//		
//	}