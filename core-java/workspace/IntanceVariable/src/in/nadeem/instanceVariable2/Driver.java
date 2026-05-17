//lecture - 35
// Take Product class with productld, productName, productPrice

// Create Driver class with print ( ) method to print product data

package in.nadeem.instanceVariable2;

class Product {

	int productId = 101;
	String productName = "Laptop";
	double productPrice = 50000.0;
}

public class Driver {

	void printProductData(Product product) {
		System.out.println("Product ID: " + product.productId);
		System.out.println("Product Name: " + product.productName);
		System.out.println("Product Price: " + product.productPrice);
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Product p = new Product();

		d.printProductData(p);
	}
}
