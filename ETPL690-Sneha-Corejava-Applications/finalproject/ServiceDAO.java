package com.evergent.corejava.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO {
    public List<String> getServices() throws Exception {
        List<String> services = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT * FROM Services")) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                services.add(rs.getString("name") + " - INR" + rs.getInt("rate"));
            }
        }
        return services;
    }
}