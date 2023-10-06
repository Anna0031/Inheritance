import java.util.*;

class fruit{
	int sum(int appleno, int mangono) {
		int sum = appleno + mangono;
		return sum;
	}
}
class apple extends fruit{
	int appleno;
	void setdata1(int appleno) {
		this.appleno = appleno;
	}
}
class mango extends fruit{
	int mangono;
	void setdata2(int mnagono) {
		this.mangono = mangono;
	}
}
public class FruitSum{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of apples: ");
	int apple = sc.nextInt();
	System.out.println("Enter the number of mangoes: ");
	int mango = sc.nextInt();
	
	fruit f = new fruit();
	System.out.println("Total number of fruits is:  "+f.sum(apple, mango));
	}
}
