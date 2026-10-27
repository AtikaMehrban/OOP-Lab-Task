class BarcodeLabel{
	private String barcodeNumber;
	private String shelfCode;
	public BarcodeLabel(String barcodeNumber,String shelfCode){
	this.barcodeNumber=barcodeNumber;
	this.shelfCode=shelfCode;
}

	public String getbarcodenumber(){
	return barcodeNumber;
}

	public String getshelfcode(){
	return shelfCode;
}

}
