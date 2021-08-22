package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Book");
		
		Seller seller = new Seller(1, "Bob", "bob@gmail", new Date(), 3000.00, department);
		System.out.println(seller);

	}

}
