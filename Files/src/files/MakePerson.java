package files;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;



public class MakePerson {
	
	ArrayList <Person> PersonList = new ArrayList <Person> ();
	
	
	public Person p; //initialises variable p
	
	public void addpeople (Person p)
    {
    PersonList.add(p);
    }
	
	public void showPeople()
	{
		for (Person p : PersonList) 
		{
		System.out.println(p);
		}
	}
	
	
	 public void writeToFile ()
	
    {
        
    try 
    {
    	PrintWriter pw = new PrintWriter (new FileOutputStream("files.txt"));
    	for( Person Person : PersonList);
    	pw.println(PersonList);
    	pw.close();
    	System.out.println(PersonList);
    	}
    catch (Exception e)
    	{
    	e.printStackTrace();
    	}
   
    }
}
