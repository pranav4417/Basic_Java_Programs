package employee; 

 

public class emp { 

int id; 

String name; 

String dep; 

double salary; 

 

emp() { 

	id = 33; 
	
	name = "Shubham"; 
	
	dep = "Electrical"; 
	
	salary = 10000; 

 

} 

emp(int i, String n, String d, double s) { 

	id = i; 
	
	name = n; 
	
	dep = d; 
	
	salary = s; 

} 

public emp(int i) { 

	id = i; 

} 

public void display() { 

	System.out.println("Employee id: "+id); 
	
	System.out.println("Employee name: "+name); 
	
	System.out.println("Employee department :"+dep); 
	
	System.out.println("Employee Salary :"+salary); 

} 

 

public static void main(String[] args) { 

		emp e = new emp(04,"Sumukh","Computer Science", 5000); 
		
		System.out.println("--------With parameters---------------"); 
		
		e.display(); 
		
		emp es = new emp(); 
		
		System.out.println("--------Without parameters---------------"); 
		
		es.display(); 
		
		System.out.println("--------Single Parameter---------------"); 
		
		emp ess = new emp(15); 
		
		ess.display(); 

 

 

} 

 

} 