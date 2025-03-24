package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/UserDB";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin123";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void main(String[] args) {
        try {
            if (getConnection() != null) {
                System.out.println("Database Connected Successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
