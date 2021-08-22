package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
			
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: SELLER findById ====");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: SELLER findByDepartment ====");
		List<Seller> sellerList = new ArrayList<>();
		Department department = new Department(2, null);
		sellerList = sellerDao.findByDepartment(department);
		
		for(Seller sellers: sellerList) {
			System.out.println(sellers);
		}
	}

}
