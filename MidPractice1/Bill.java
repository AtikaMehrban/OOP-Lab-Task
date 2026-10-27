class Bill{
	private String billNumber;
	private double totalAmount;
	public Bill(String billNumber,double totalAmount){
	this.billNumber=billNumber;
	this.totalAmount=totalAmount;
}
	public void displayBill(){
	System.out.println("billNumber:"+billNumber);
	System.out.println("totalAmount:"+totalAmount);
}
	
	public String getbillNumber(){
	return billNumber;
}
	public double gettotalAmount(){
	return totalAmount;
}
	
}
	
