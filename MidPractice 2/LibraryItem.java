class LibraryItem{
	private String itemId;
	private String title;
	private BarcodeLabel label;

public LibraryItem(String itemId,String title,String barcodeNumber,String shelfCode){
	this.itemId=itemId;
	this.title=title;
	this.label = new BarcodeLabel(barcodeNumber,shelfCode);
	}
	public void displayInfo(){
	System.out.println(label.getbarcodenumber());
	System.out.println(label.getshelfcode());
	System.out.println(itemId);
	System.out.println(title);

}
}
