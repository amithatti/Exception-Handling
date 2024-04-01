package exceptionHandling;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand name: ");
		String brand = sc.next();
		System.out.println("Enter the price: ");
		int cost = sc.nextInt();
		System.out.println("Enter the color: ");
		String color = sc.next();
		
		try {
			Product p = new Product(brand, cost, color);
			System.out.println(p);					
		}catch(InvalidPriceException e) {
			System.out.println(e.msg());
		}
	}

}
