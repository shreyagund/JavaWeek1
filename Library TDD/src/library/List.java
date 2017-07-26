package library;



public class List {
	
	
	public static void main(String[] args) {
		
		
		Library l = new Library();
		
		////adding items to an arrayList 
		
		Items i1 = new Items("Cosmopolitan ", "Magazine ", 1);
		Items i2 = new Items("Aaron's Tinder Addiction ", "Book ", 2);
		Items i3 = new Items("The Computer Journal ", "Journal ", 3);
		Items i4 = new Items("Vogue ", "Magazine ", 4);
		Items i5 = new Items("Angry Adam ", "Book ", 5);
		Items i6 = new Items("Nick's Broken Toilet ", "Journal ", 6);
		
		
		
		Member m1 = new Member("Shreya ", 21, 101);
		Member m2 = new Member("Mary ", 23, 102);
		Member m3 = new Member("Nick ", 12, 103);
		Member m4 = new Member("Adam ", 31, 104);
		Member m5 = new Member("Aaron ", 35, 105);
		Member m6 = new Member("Alan ", 25, 106);
		
		
		
		l.addItems(i1);
		l.addItems(i2);
	    l.addItems(i3);
	    l.addItems(i4);
		l.addItems(i5);
		l.addItems(i6);
		l.showItems();
		l.removeItems(1);
		l.updateItems("Captain Underpants", "book", 1); //updating no. 1
		l.checkOutItem("Vogue ", "Magazine ", 2);  
		
		
		l.addMember(m1);
		l.addMember(m2);
		l.addMember(m3);
		l.addMember(m4);
		l.addMember(m5);
		l.showMember();
		l.removeMember(106);
		l.updateMember("Shreya", 21, 3); //the last number is position in arraylist
		
		
		
				
	}


	
}
