package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById() ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment() ===");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n=== TEST 3: seller findAll() ===");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("\n=== TEST 4: seller insert() ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gamil.com", new Date(), 400.00, department);
        sellerDao.insert(newSeller);
        System.out.println("\nInserted! New Id = " + newSeller.getId());


        System.out.println("\n=== TEST 5: seller insert() ===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed!");
         */

        SellerDao sellerDao = DaoFactory.createSellerDao();
        sellerDao.insert(new Seller(null, "Sarah Spencer", "spencersarag@yahoo.com", new Date(), 2100.00, new Department(1, null)));
    }
}
