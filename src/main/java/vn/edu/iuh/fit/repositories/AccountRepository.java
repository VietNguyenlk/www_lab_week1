package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
    private Connection connection;

    public AccountRepository() throws SQLException {
        connection = ConnectionDB.getInstance().getConnection();
    }

    // load account
    public List<Account> getAllAccount(){
        String sql = "select * from account";
        List<Account> list = new ArrayList<Account>();
    try{
    PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            String id = rs.getString(1);
            String name = rs.getString(2);
            String pass = rs.getString(3);
            String email =rs.getString(4);
            int phone = rs.getInt(5);
            int status = rs.getInt(6);
            Account acc = new Account(id,name,pass,email,phone,status);
            list.add(acc);
        }
    }catch (SQLException e){
        e.printStackTrace();
    }

        return list;
    }
// add account
    public boolean insertACC(Account acc) {
        String sql = "INSERT INTO account values (?,?,?,?,?,?) ";
        int rs;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, acc.getId());
            ps.setString(2, acc.getFullName());
            ps.setString(3, acc.getPassWord());
            ps.setString(4, acc.getEmail());
            ps.setInt(5, acc.getPhone());
            ps.setInt(6, acc.getStatus());
            rs = ps.executeUpdate();
            return rs > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }




}
