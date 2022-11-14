package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Kahve Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("blabla.jpg");
		product1.setUnirsInStock(3);
		product1.setUnitPrice(6700);

		Product product2 = new Product();
		product2.setName("Kahve Makinesi 2");
		product2.setDiscount(37);
		product2.setImageUrl("blabla2323.jpg");
		product2.setUnirsInStock(33);
		product2.setUnitPrice(67020);

		Product product3 = new Product();
		product3.setName("Kahve Makinesi 3");
		product3.setDiscount(72);
		product3.setImageUrl("blabla3.jpg");
		product3.setUnirsInStock(323);
		product3.setUnitPrice(67001);

		Product[] products = { product1, product2, product3 };

		System.out.println("<ul>");

		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("50505050505");
		individualCustomer.setId(1);
		individualCustomer.setPhone("55555555555");
		individualCustomer.setLastName("Hakan");
		individualCustomer.setLastName("Erolan");
		System.out.println(individualCustomer.getLastName());
		CorperateCustomer corperateCustomer = new CorperateCustomer();
		corperateCustomer.setTaxNumber("23232323");
		corperateCustomer.setCompanyName("Sakaryayarka");
		corperateCustomer.setId(3);
		corperateCustomer.setPhone("50505050555555");
		corperateCustomer.setCustomerNumber("13232");
		
		Customer[] customers = {corperateCustomer, individualCustomer};
		
		for(Customer i : customers) {
			System.out.println(i.getClass());
			
		}
	}

}
