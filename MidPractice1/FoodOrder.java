class FoodOrder{
	private String orderId;
	private Customer customer;
	private Bill bill;
	
	public FoodOrder(String orderId,Customer customer,String billNumber,double totalAmount){
	this.orderId=orderId;
	this.customer=customer;
	this.bill=new Bill(billNumber,totalAmount);
	
}
	public void displayOrder(){
	System.out.println("OrderId:"+orderId);
	bill.displayBill();
	customer.displayInfo();
}
}

