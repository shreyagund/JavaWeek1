package library;

public class Items {

	

		String name;
		String type;    //books/journals/magazines
		int iD;

		
	
		public Items(String name, String type, int iD) {
			super();
			this.name = name;
			this.type = type;
			this.iD = iD;
		}

		public String toString(){
		 return "Name: " + name + "Type: " + type + "ID: " + iD;
		 }
 
		 
		 
	}                          
	
	
	
	
	


