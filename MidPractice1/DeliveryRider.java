class DeliveryRider extends Person{
	
	private String vehicleNumber;
	public DeliveryRider(String personId,String name,String vehicleNumber){
	super(personId,name);
	this.vehicleNumber=vehicleNumber;
}
@Override
public void displayInfo(){
	System.out.println(getname());
	System.out.println(getpersonId());
	System.out.println("VehicleNumber:"+vehicleNumber);
}
}
