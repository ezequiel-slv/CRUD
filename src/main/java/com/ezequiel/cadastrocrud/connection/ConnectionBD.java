package com.ezequiel.cadastrocrud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {

    private static final String URL = System.getenv("MYSQL_URL");
    private static final String USER = System.getenv("MYSQL_USER");
    private static final String PASSWORD = System.getenv("MYSQL_PASSWORD");

    public static Connection connectonDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()){
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
