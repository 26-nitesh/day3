package vars;

public class Person {

//  Static
	static String nationality = "Indian";
//	below are non static variables
	String name;
	int age;
	String gender;
//	attribute or properties of person
	public static void main(String[] args) {
//		int x =6;
		Person p1 = new Person();//creating a object
		p1.name = "AMit Kumar JHa";
		p1.age = 21;
		p1.gender = "Male";
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		
		System.out.println("-----------------------------");
		Person p2 = new Person();
		p2.name = "Shyam Ram";
		p2.age = 34;
		p2.gender = "Male";
		
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}
