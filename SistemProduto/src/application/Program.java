package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		também funciona:
		/*
		 * Product p1 = new Product(); Product p2 = new Product("Computador" + 1500.0);
		 * Product p3 = new Product("Teclado" + 80.0);
		 * 
		 * System.out.println(p1); System.out.println(p2); System.out.println(p3);
		 */

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price); // CONSTRUTOR.
		
		product.setName("Computador");
		System.out.println("Update name: " + product.getName());

		product.setPrice(1200.00);
		System.out.printf("Updated price %.2f", product.getPrice());

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();
	}

}