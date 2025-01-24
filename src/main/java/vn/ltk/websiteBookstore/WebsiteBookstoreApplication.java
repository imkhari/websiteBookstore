package vn.ltk.websiteBookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.ltk.websiteBookstore.entity.CatalogBook;
import vn.ltk.websiteBookstore.entity.OrderDetails;

@SpringBootApplication
public class WebsiteBookstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebsiteBookstoreApplication.class, args);
		OrderDetails ordDel = new OrderDetails();

	}
}
