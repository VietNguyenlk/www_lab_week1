package vn.edu.iuh.fit.controllers;

import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.repositories.AccountRepository;

import java.util.List;

public class test {
    public static void main(String[] args) {
        try{
            AccountRepository dao = new AccountRepository();
            List<Account> ds = dao.getAllAccount();
            for (Account acc : ds) {
                System.out.println(acc);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        try{
//            AccountRepository dao = new AccountRepository();
//            Account acc = new Account("vi","viet","0345641602","viet@gmail.com",12345679,1);
//            dao.insertACC(acc);
//            System.out.println("isert thanh cong");
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
