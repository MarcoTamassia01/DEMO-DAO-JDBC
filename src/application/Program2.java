package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	DepartmentDao departmentDao =  DaoFactory.createDepartmentDao();
	
	System.out.println("==== TESTE 1 : Department findbyID: ======");
	Department department = departmentDao.findById(3);
	System.out.println(department);
	
	System.out.println("\n==== TESTE 2 : Department findALLt: ======");
	List<Department> list = departmentDao.findAll();
	list.forEach(System.out::println);	
		
	System.out.println("\n==== TESTE 3 : Department Insert: ======");	
	Department newDepartment = new Department(null, "Accounting");
	departmentDao.insert(newDepartment);
	System.out.println("Inserted! New Id: " + newDepartment.getId());
	
	System.out.println("\n==== TESTE 4 : Department Update: ======");
	department = departmentDao.findById(6);
	department.setName("Comex");
	departmentDao.update(department);
	System.out.println("Update Complete");
	
	System.out.println("\n==== TESTE 5 Department DeleteById: ======");
	System.out.print("Enter id for delete test ");
	int id =sc.nextInt();
	departmentDao.deleteById(id);
	System.out.println("Deleted Complete");
	

	sc.close();
	
	}

}
