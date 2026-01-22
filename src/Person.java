
public class Person {

	    String name;
	    int age = 18;   

	    Person(String n, int a) {
	        name = n;
	        age = a;
	    }

	    void display() {
	        System.out.println("name = "+name);
	        System.out.println("age = "+age);
	    }
	

	    public static void main(String[] args) {
	        Person p = new Person("Kavitha", 20);
	        p.display();
	    } 
	

}
