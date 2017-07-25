package library;



public class List {
	
	
	public static void main(String[] args) {
		
		
		Library l = new Library();
		
		
		
		Items i1 = new Items("Cosmopolitan ", "Magazine ", 1);
		Items i2 = new Items("Aaron's Tinder Addiction ", "Book ", 2);
		Items i3 = new Items("The Computer Journal ", "Journal ", 3);
		Items i4 = new Items("Vogue ", "Magazine ", 4);
		Items i5 = new Items("Annoying Adam ", "Book ", 5);
		Items i6 = new Items("Nick's Broken Toilet ", "Journal ", 6);
		
		
		l.addItems(i1);
		l.addItems(i2);
	    l.addItems(i3);
	    l.addItems(i4);
		l.addItems(i5);
		l.addItems(i6);
		l.showItems();
		l.removeItems();
				
	}


	
}
