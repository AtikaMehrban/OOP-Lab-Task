class DeliveryDesk{
	private String deskName;
	private FoodOrder[] orders= new FoodOrder[3];
	int Ordercount = 0;
	private DeliveryRider[] riders= new DeliveryRider[2];
	int Ridercount = 0;
	

	public DeliveryDesk(String deskName){
	this.deskName=deskName;
	System.out.println(deskName);
	}

	public void addOrder(FoodOrder order){
	if(Ordercount<orders.length){
	orders[Ordercount]=order;
	Ordercount++;
}
	else{
	System.out.println("capacity is full");
}
}

	public void addRider(DeliveryRider rider){
	if(Ridercount<riders.length){
	riders[Ridercount]=rider;
	Ridercount++;
}
	else{
	System.out.println("capacity is full");
}

}

	public void displayDesk(){
	for(int i=0;i<Ordercount;i++){
	System.out.println("details of order");
	orders[i].displayOrder();
}
	for(int i=0;i<Ridercount;i++){
	System.out.println("details of riders");
	riders[i].displayInfo();
}
}
}
	
	
