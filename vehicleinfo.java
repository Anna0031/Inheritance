import java.util.*;

class vehicle{
	int  mileage;
	double price; 
	vehicle(int mileage, double price){
		super();
		this.mileage = mileage;
		this.price = price; 
	}
}
class Car extends vehicle{
	double ownership_cost;
	int warranty;
	int seating_capacity;
	String fuel_type;
	
	Car(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type){
		super(mileage, price);
		this.ownership_cost = ownership_cost;
		this.warranty = warranty;
		this.seating_capacity = seating_capacity;
		this.fuel_type = fuel_type;
	}	
}
class Bike extends vehicle{
	int no_cylinders;
	int no_gears;
	String cooling_type;
	String alloy; 
	int fuel_size;
	
	Bike(int mileage, double price, int no_cylinder, int no_gears, String cooling_type, String alloy, int fuel_size){
		super(mileage,price);
		this.no_cylinders = no_cylinder;
		this.no_gears = no_gears;
		this.cooling_type = cooling_type;
		this.alloy = alloy;
		this.fuel_size = fuel_size;
	}
}
class Audi extends Car{
	String model_type;
	Audi(String model_type, int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type){
			super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
			this.model_type = model_type;
	}
	public String display() {
		return("Audi [ "+"model_type ,"+model_type+"mileage ,"+mileage+"price ,"+price+"ownership_cost ,"+ownership_cost+"warranty ,"+warranty+"seating_capacity ,"+seating_capacity+"fuel_type "+fuel_type+"]");
	}
	
}
class Ford extends Car{
	String model_type;
	Ford(String model_type, int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type){
		super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
		this.model_type = model_type;
	}
	public String display1() {
		return("Ford [ "+"model_type ,"+model_type+"mileage ,"+mileage+"price ,"+price+"ownership_cost ,"+ownership_cost+"warranty ,"+warranty+"seating_capacity ,"+seating_capacity+"fuel_type "+fuel_type+"]");
	}
}
class Bajaj extends Bike{
	String make_type;
	Bajaj(String make_type, int mileage, double price, int no_cylinder, int no_gears, String cooling_type, String alloy, int fuel_size){
		//super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_size);
		super(mileage,price,no_cylinder,no_gears,cooling_type,alloy,fuel_size);
		this.make_type = make_type;
	}
	public String display2() {
		return("Bajaj ["+"make_type ,"+ make_type+"mileage ,"+mileage+"price ,"+price+"no_cylinder ,"+no_cylinders+"no_gears ,"+no_gears+"cooling_type ,"+cooling_type+"alloy ,"+alloy+"fuel_size "+fuel_size+"]");
	}
	
}
class TVS extends Bike{
	String make_type;
	TVS(String make_type, int mileage, double price, int no_cylinder, int no_gears, String cooling_type, String alloy, int fuel_size){
		super(mileage,price,no_cylinder,no_gears,cooling_type,alloy,fuel_size);
		this.make_type = make_type;
	}
	public String display3() {
		return("TVS ["+"make_type ,"+ make_type+"mileage ,"+mileage+"price ,"+price+"no_cylinder ,"+no_cylinders+"no_gears ,"+no_gears+"cooling_type ,"+cooling_type+"alloy ,"+alloy+"fuel_size ]"+fuel_size+"]");
	}
}

public class vehicleinfo {
	public static void main(String[] args) {
		
		Audi a = new Audi("Audi ",8 ,9000000 ,10000000 ,5 ,5 ," Petrol");
		System.out.println(a.display()); 
		
		Ford f = new Ford("Ford",12,10_00_000,15_00_000,3,7," Diesel");
		System.out.println(f.display1());
		
		Bajaj b = new Bajaj("Bajaj ",70 ,120000 ,2 ,6 ," liquid"," cap", 10);
		System.out.println(b.display2());
		
		TVS t = new TVS("TVS ",60 ,70000 ,2 ,0 ,"air ","N.A ",5);
		System.out.println(t.display3());	
	}
}













