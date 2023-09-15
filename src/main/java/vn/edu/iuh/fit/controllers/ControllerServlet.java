package vn.edu.iuh.fit.controllers;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.models.Account;
import vn.edu.iuh.fit.repositories.AccountRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = {"/controllerServlet"})
public class ControllerServlet extends HttpServlet {

//    public  void  doGet(HttpServletRequest reg, HttpServletResponse ro) throws IOException {
        //ro.getWriter().println("xin chao cac ban");
        // get data from dao

//      try {
//          AccountRepository dao = new AccountRepository();
//          List<Account> listacc = dao.getAllAccount();
//          // set data to dashbroah.html
//          reg.setAttribute("list",listacc);
//          reg.getRequestDispatcher("/dashbroad.jsp").forward(reg,ro);
//      }catch (Exception e){
//          e.printStackTrace();
//      }

//    }

    public  void  doGet(HttpServletRequest reg, HttpServletResponse ro) throws IOException {
        System.out.println("Hello");
        // get data from dao
        String action = reg.getParameter("action");
        if(action.equals("dashboard")) {
            try {
                AccountRepository dao = new AccountRepository();
                List<Account> listacc = dao.getAllAccount();
                // set data to dashbroah.html
//                reg.setAttribute("account", (Account) listacc.get(1));
                reg.setAttribute("account", (List<Account>) listacc);
                reg.getRequestDispatcher("/dashbroad.jsp").forward(reg, ro);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public  void doPost(HttpServletRequest reg, HttpServletResponse ro )throws IOException {

    }

}
