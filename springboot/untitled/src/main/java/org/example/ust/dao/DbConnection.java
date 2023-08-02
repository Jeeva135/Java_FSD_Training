package org.example.ust.dao;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/library";
    private static final String USER_NAME="root";
    private static final String PASSWORD="root";

    private DbConnection(){}

    public static Connection getConnection() throws Exception{
        DriverManager.registerDriver(new Driver());
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        }

}
