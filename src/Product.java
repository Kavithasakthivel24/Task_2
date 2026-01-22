import java.util.Scanner;

public class Product {
	
	    int pid, quantity;
	    double price;

	    Product(int id, double p, int q) {
	        pid = id;
	        price = p;
	        quantity = q;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	 Scanner sc = new Scanner(System.in);
	         Product[] p = new Product[5];

	         for (int i = 0; i < 5; i++) {
	             p[i] = new Product(sc.nextInt(), sc.nextDouble(), sc.nextInt());
	         }

	         int maxPid = p[0].pid;
	         double maxPrice = p[0].price;
	         double total = 0;

	         for (int i = 0; i < 5; i++) {
	             if (p[i].price > maxPrice) {
	                 maxPrice = p[i].price;
	                 maxPid = p[i].pid;
	             }
	             total += p[i].price * p[i].quantity;
	         }
	        //System.out.println("Hello");
	        System.out.println("Highest price PID: " + maxPid);
	        System.out.println("Total Amount: " + total);
	    }


}
