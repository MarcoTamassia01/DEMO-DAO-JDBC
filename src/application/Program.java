package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		
	Scanner sc =  new Scanner(System.in);	
		
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	
	
	System.out.println("==== TESTE 1 : Seller findbyID: ======");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n==== TESTE 2 : Seller findbyDepartment: ======");
	Department department =  new Department(2,null);
	List<Seller> list = sellerDao.findByDepartment(department);
	list.forEach(System.out::println);
	
	
	System.out.println("\n==== TESTE 3 : Seller findALLt: ======");
	list = sellerDao.findAll();
	list.forEach(System.out::println);
	
	
	
	System.out.println("\n==== TESTE 4 : Seller Insert: ======");
	Seller newSeller = new Seller(null, "Greg","greg@gmail.com", new Date(), 4000.00, department); 
	sellerDao.insert(newSeller);
	System.out.println("Inserted! New Id: " + newSeller.getId());

	
	
	System.out.println("\n==== TESTE 5 : Seller Update: ======");
	seller = sellerDao.findById(1);
	seller.setName("Martha Waine");
	sellerDao.update(seller);
	System.out.println("Update Complete");
	
	System.out.println("\n==== TESTE 6 : Seller DeleteById: ======");
	System.out.print("Enter id for delete test ");
	int id =sc.nextInt();
	sellerDao.deleteById(id);
	System.out.println("Deleted Complete");
	
	sc.close();
	
	}

}
