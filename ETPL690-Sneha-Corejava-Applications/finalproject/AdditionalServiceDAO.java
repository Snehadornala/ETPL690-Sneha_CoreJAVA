package com.evergent.corejava.finalproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AdditionalServiceDAO {
    public List<String> getAdditionalServices() throws Exception {
        List<String> additionalServices = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT * FROM AdditionalServices")) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                additionalServices.add(rs.getString("name") + " - INR" + rs.getInt("rate"));
            }
        }
        return additionalServices;
    }
}