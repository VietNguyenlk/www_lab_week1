package vn.edu.iuh.fit.controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.repositories.AccountRepository;

import java.io.IOException;

@WebServlet(urlPatterns = {"/logincontrol"})
public class LoginControl extends HttpServlet {

    public  void doPost(HttpServletRequest reg, HttpServletResponse ro )throws IOException {
        try {
            String user = reg.getParameter("username");
            String pass = reg.getParameter("password");
            AccountRepository dao =  new AccountRepository();
            Account a = dao.checkLogin(user,pass);
            if(a==null){
                ro.sendRedirect("index.jsp");
            }else{
                ro.sendRedirect("account.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
