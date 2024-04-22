package vars;

public class A {

	static int x = 10;
	int y= 67; //non static
	public static void main(String[] args) {//static
		System.out.println(x);
		A a1 = new A();
		a1.y = 98;
		System.out.println(a1.y);
		
		A a2 = new A();
//		as non static variables initialized inside object
//		each time when the refernce var is created
		
//		the y value will not be 98 rather it will be 67
		System.out.println("a2 info");
		System.out.println(a2.y);
	}
	
}
