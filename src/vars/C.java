package vars;

public class C {

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1);//prints reference value of c1
		c1.sayHi();
		
	}
	
	public void sayHi() {//non static
		System.out.println("Hi I'm Here....");
		sayBye();
	}
	public void sayBye() {//non static
		System.out.println("i am insde sayBye");
		System.out.println(this);
		//this is keyword , which is used to point current object
		System.out.println("Too Soon, AnyWay Bye!!");
		doNothing();
	}
	
	public static void doNothing() {
//		we cant use this keyword in static method
//		bcz this keyword is related to object, but staic does not
//		belongs to object
//		System.out.println(this);  ERROR
		System.out.println("Okay..Doing Nothing !");
		
//		Now Currently we are in static method
//		and to call non static method from here we will require object
		C c2 = new C();
		c2.last();
	}
	
	public void last() {
		System.out.println("Lets SEEEE");
	}
	
//https://www.javatpoint.com/difference-between-static-and-non-static-in-java
}
