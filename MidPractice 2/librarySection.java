class LibrarySection{
	private String sectionName;
	private LibraryItem[] items=new LibraryItem[4];
	private int count=0;
public LibrarySection(String sectionName){
	this.sectionName=sectionName;
	
}

	public void getsectionName(){
	System.out.println(sectionName);
}
	
	public void addItem(LibraryItem item){
	if(count < items.length){
	items[count] = item;
	count++;
} else{
	System.out.println("Library is full");
	
}
}
	public void displayItems(){
	for(int i=0;i<count;i++){
	items[i].displayInfo();
}
}
}