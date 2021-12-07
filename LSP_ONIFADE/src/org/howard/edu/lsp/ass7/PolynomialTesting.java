package org.howard.edu.lsp.ass7;

/**
 * @author Morenike Onifade
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PolynomialTesting{
	public static void main(String[] args) throws FileNotFoundException {
			
			Scanner scan = new Scanner(new File("operations.txt"));
			Polynomial  poly = new Polynomial();
			while (scan.hasNextLine()) {
				String integers[] = scan.nextLine().split(" ");
				switch (integers[0]) {
				
				case "insert":
					System.out.println("Operation: Insert");
					poly.insert(Integer.valueOf(integers[1]),Integer.valueOf(integers[2]));
					System.out.println(poly.toString());
					break;
					
				case "product":
					System.out.println("Operation: Product");
					System.out.println(poly.product());
					System.out.println(poly.toString());
					break;
					
				case "delete":
					System.out.println("Operation: Delete");
					poly.delete(Integer.valueOf(integers[1]),Integer.valueOf(integers[2]));
					System.out.println(poly.toString());
				}
			}
		}
	
	}