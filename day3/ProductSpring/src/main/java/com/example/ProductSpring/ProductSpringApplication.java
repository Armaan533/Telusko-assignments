package com.example.ProductSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);

		ProductService service = context.getBean(ProductService.class);

//		List<Product> products = service.getAllProducts();
//		for(Product p : products){
//			System.out.println(p);
//		}

//		System.out.println("==============================================");
//
//        System.out.println("a Particular product");
//
//        Optional<Product> p = service.getProduct("Logi Mouse");
//        System.out.println(p);

		// System.out.println("==============================================");
		// System.out.println("a Particular text");

		// List<Product> prods = service.getProductWithText("black");
		// for(Product product : prods){
		//     System.out.println(product);
		// }

		 System.out.println("==============================================");
		 System.out.println("A Particular Place");

		 List<Product> prods = service.getProductWithPlace("black");
		 //Use of Stream API
		 Stream<Product> data = prods.stream();
		 data.forEach(n -> System.out.println(n));
		// // Stream can be used only once and is useful for avoiding data leakages

//        System.out.println("==============================================");
//        System.out.println("A Particular Warranty");
//
//        List<Product> prods = service.getProductWithWarranty(2020);
//        // Use of Stream API
//        Stream<Product> data = prods.stream();
//        data.forEach(n -> System.out.println(n));

	}


}
