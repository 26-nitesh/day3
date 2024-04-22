package vars;

public class B {
//static -non static method
	public static void main(String[] args) { //static
		greet();
		B b1 = new B();
		b1.sayHi();
	}
	
	public static void greet() {
		System.out.println("Greeeitng From Static Method");
	}
	public void sayHi() {
		System.out.println
		("Saying Hi From Non static Method");
	}
}
