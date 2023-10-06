import java.util.*;
class Marks{
	int rollno=0;
	String name;
	float totalmarks;
	float avgmarks;
	void display() {
		System.out.println("Name of the Student: "+name+ "\nRollnumber: "+rollno);
	}
}
class Physics extends Marks{
	int phy;
	void display1() {
		System.out.println("Marks in Physics: "+phy);
	}
	
}
class Chemistry extends Marks{
	int chem;
	void display2() {
		System.out.println("Marks in Chemistry: "+chem);
	}

}
class Mathematics extends Marks{
	int math;
	void display3() {
		System.out.println("Marks in Mathematics: "+math);
	}

}
class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		Marks m0 = new Marks();
		Physics p = new Physics();
		Chemistry c = new Chemistry();
		Mathematics m = new Mathematics();
		int studentno = sc.nextInt();
		for(int i=0; i<studentno ;i++) {
		m0.rollno = m0.rollno+1;
		System.out.println("Enter the name of the student: ");
		m0.name = sc.next();
		System.out.println("Rollno :"+m0.rollno);
		System.out.println("Enter the marks for physics: ");
		p.phy = sc.nextInt();
		System.out.println("Enter the marks for chemistry : ");
		c.chem = sc.nextInt();
		System.out.println("Enter the marks for mathematics: ");
		m.math = sc.nextInt();
		m0.totalmarks = p.phy+c.chem+m.math;
		m0.avgmarks = (float)m0.totalmarks/3;
		m0.display();
		p.display();
		c.display2();
		m.display3();
		System.out.println("The total marks are: "+m0.totalmarks);
		System.out.println("The average is: "+m0.avgmarks);
		}
	}
}
