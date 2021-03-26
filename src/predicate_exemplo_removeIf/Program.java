package predicate_exemplo_removeIf;

import java.util.ArrayList;
import java.util.List;

import entitie.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("HD", 80.90));
		
		Double min =100.0;
		
		list.removeIf(p -> p.getPrice()>=min);
		
		for(Product p: list) {
			System.out.println(p);
			
		}
		

	}

}
