package vars;

public class ItEmployee {
/*
 * int a =10;// java is statically typed language
//	that is each and every variable must have some type	
 */
	static String department = "IT"; //static -> belongs to class
    //below non static ->belongs to objects
	String name;
    int age;
    float salary;
    String companyName;
    
    public static void main(String[] args) {
		ItEmployee e1 = new ItEmployee();
	    e1.setEmployeeDetails(e1,"Amit",34,232123.5f,"XYZ");//calling a method
	    e1.displayEmployeeDetails(e1);
		
	     
	    ItEmployee e2 = new ItEmployee();
	    e2.setEmployeeDetails(e2,"Arun",24,6572.5f,"ABCN");//calling a method
	    e2.displayEmployeeDetails(e2);
		
	}
    
    public  void setEmployeeDetails
    (ItEmployee employee,String n,int a,float s,String c) {//non-static
    	employee.name=n;
    	employee.age = a;
    	employee.salary = s;
    	employee.companyName = c;
    }
    
    public void displayEmployeeDetails(ItEmployee employee) {
    	System.out.println("----START----");
    	System.out.println(employee.name);
    	System.out.println(employee.age);
    	System.out.println(employee.salary);
    	System.out.println(employee.companyName);
    	
    	System.out.println(department);//method1
    	
    	System.out.println(ItEmployee.department);//method2
    	
    	System.out.println("-------END---------");
    }
}
