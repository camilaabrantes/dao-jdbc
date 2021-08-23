package application;

import java.util.ArrayList;
import java.util.Date;
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
		List<Seller> sellerListByDepartment = new ArrayList<>();
		Department department = new Department(2, null);
		sellerListByDepartment = sellerDao.findByDepartment(department);
		
		for(Seller sellers: sellerListByDepartment) {
			System.out.println(sellers);
		}
		
		System.out.println("\n==== TEST 3: SELLER findAll ====");
		List<Seller> sellerList = new ArrayList<>();
		sellerList = sellerDao.findAll();
		
		for(Seller sellers: sellerList) {
			System.out.println(sellers);
		}
		
		System.out.println("\n==== TEST 4: SELLER insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println(newSeller.getId());
		
		System.out.println("\n==== TEST 5: SELLER update  ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		seller.setEmail("martha@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update realizado com sucesso!");		
		
		System.out.println("\n==== TEST 6: SELLER delete  ====");
		sellerDao.deleteById(12);
		System.out.println("Deleted Completed!");
	}

}
