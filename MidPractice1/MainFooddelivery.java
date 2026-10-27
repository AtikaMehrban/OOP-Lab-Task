class MainFooddelivery{
public static void main(String[] args){

	Customer c1=new Customer("01","Sara","Multan");
	DeliveryRider d1=new DeliveryRider("02","Sana","15V");
	DeliveryRider d2=new DeliveryRider("03","Saba","16V");
	FoodOrder f1=new FoodOrder("01",c1,"101",1000);
	FoodOrder f2=new FoodOrder("02",c1,"201",2000);

	DeliveryDesk d =new DeliveryDesk("Fooddesk");
	d.addOrder(f1);
	d.addOrder(f2);
	d.addRider(d1);
	d.addRider(d2);
	d.displayDesk();
	}
	}