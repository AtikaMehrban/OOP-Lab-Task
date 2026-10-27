class Customer extends Person{
	private String address;
	public Customer(String personId,String name,String address){
	super(personId,name);
	this.address=address;
}
@Override
	public void displayInfo(){
	System.out.println(getname());
	System.out.println(getpersonId());

	System.out.println("Address:"+address);
}
	
}
