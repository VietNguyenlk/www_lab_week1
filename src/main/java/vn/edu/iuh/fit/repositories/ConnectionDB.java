package vn.edu.iuh.fit.repositories;

import vn.edu.iuh.fit.models.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConnectionDB {
    private static ConnectionDB instance;
    private final Connection connection;


    private ConnectionDB() throws SQLException {
        String url = "jdbc:mariadb://localhost:3306/mydb";
        connection = DriverManager.getConnection(url, "root", "sapassword");
//        if (connection != null) {
//            System.out.println("Kết nối đến MariaDB thành công.");
//        }
    }

    public static ConnectionDB getInstance() throws SQLException {
        if (instance == null)
            instance = new ConnectionDB();
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("dong ket noi.");


        }
    }


//    public static void main(String[] args) throws SQLException {
//
//            // Lấy một đối tượng kết nối từ lớp ConnectionDB
//            ConnectionDB connectionDB = ConnectionDB.getInstance();
//
//            // Kiểm tra kết nối
//            Connection connection = connectionDB.getConnection();
//            if (connection != null) {
//                System.out.println("da co ket noi den MariaDB.");
//                // Thực hiện các thao tác với cơ sở dữ liệu ở đây (nếu cần)
//            }
//
//            // Đóng kết nối
//            connectionDB.closeConnection();
//
//
//    }


}
