class shape{
	void display() {
		System.out.println("This is a shape. ");
	}
}
class Polygon extends shape{
	void display() {
		System.out.println("Polygon is a shape. ");
	}
}
class Rectangle extends Polygon{
	void display() {
		System.out.println("Rectangle is a polygon. ");
	}
}
class Triangle extends Polygon{
	void display() {
		System.out.println("Triangle is a polygon. ");
	}
}
class Square extends Polygon{
	void display() {
		System.out.println("Square is a polygon. ");
	}
}
public class ShapeInfo {
	public static void main(String[] args) {
		shape s = new shape();
		s.display();
		
		Polygon p = new Polygon();
		p.display();
		
		Rectangle r = new Rectangle();
		r.display();
		
		Triangle t = new Triangle();
		t.display();
		
		Square sq = new Square();
		sq.display();
	}
}
