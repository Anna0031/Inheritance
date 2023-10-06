class Mammal {
	void display1() {
		System.out.println("I am a mammal.");
	}
}
class MarineAnimals extends Mammal{
	void display2() {
		System.out.println("I am a Marine Animal.");
	}
}
class BlueWhale extends MarineAnimals{
	void display3() {
		System.out.println("I belong to both the categories: Mammals as well as Marine Animals.");
	}
}
public class MammalClass{
	public static void main(String[] args) {
		Mammal m = new Mammal();
		MarineAnimals ma = new MarineAnimals();
		BlueWhale b = new BlueWhale();
		Mammal b2 = new BlueWhale();
		MarineAnimals b3 = new BlueWhale();
		
		m.display1();
		ma.display2();
		b.display3();
		b.display1();
		b.display2();
	}
}