package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		System.out.println("Type the value you want to exclude from the list: ");
		double value = sc.nextDouble();
		
		list.removeIf(p -> p.getPrice() >= value);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
		sc.close();

	}

}
