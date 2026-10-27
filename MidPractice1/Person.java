class Person{
	private String personId="001";
	private String name="Unknown";
	public Person(String personId,String name){
	this.personId=personId;
	this.name=name;
	}
	public void displayInfo(){
	System.out.println("Name:"+name);
	System.out.println("PersonId:"+personId);
}
	public String getpersonId(){
	return personId;
}
	public String getname(){
	return name;
}
}