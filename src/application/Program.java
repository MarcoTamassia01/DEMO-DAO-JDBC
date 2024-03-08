package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	
	
	
	System.out.println("==== TESTE 1 : Seller findbyID: ======");
	Seller seller = sellerDao.findById(3);
	System.out.println(seller);
	
	System.out.println("\n==== TESTE 1 : Seller findbyDepartment: ======");
	Department department =  new Department(2,null);
	List<Seller> list = sellerDao.findByDepartment(department);
	list.forEach(System.out::println);
	

	}

}
