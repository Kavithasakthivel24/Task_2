
class Employee extends Person2{
	
	    int employeeID;
	    double salary;

	    Employee(String n, int a, int id, double s) {
	        super(n, a);   
	        employeeID = id;
	        salary = s;
	    }

	    void display() {
	        System.out.println("Name = "+name); 
	        System.out.println("Age = "+age);
	        System.out.println("Employee_ID = "+employeeID);
	        System.out.println("Salary = "+salary);
	    }
	    
	      public static void main(String[] args) {
	            Employee e = new Employee("Kavitha", 22, 101, 25000);
	            e.display();
	        }
}

