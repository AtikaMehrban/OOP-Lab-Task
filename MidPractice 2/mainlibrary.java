class Mainlibrary{
	public static void main (String[] args){
	Book b1=new Book("AT","101","Maths","12E","13A");
	Book b2=new Book("FA","201","BIO","13E","14A");
	Magazine m1=new Magazine("301","PHY","14E","15A",10);
	LibrarySection l=new LibrarySection("First Section");
	l.getsectionName();

	l.addItem(b1);
	l.addItem(b2);
	l.addItem(m1);

	Book b3=new Book("MU","401","CHEM","15E","16A");
	l.addItem(b3);

	l.displayItems();
	
	Book b4=new Book("HA","501","ECO","16E","17A");
	l.addItem(b4);
	
}
}

	
	