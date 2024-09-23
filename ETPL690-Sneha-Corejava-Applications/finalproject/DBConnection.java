package com.evegent.corejava.finalproject;
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/CarServiceDB";
    private static final String USER = "root"; // Replace with your username
    private static final String PASSWORD = "admin"; // Replace with your password

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}