
package com.evergent.corejava.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReportDAO {
    public String generateInvoice(int serviceId, int additionalServiceId) throws Exception {
        StringBuilder invoice = new StringBuilder();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement("SELECT name, rate FROM Services WHERE id = ?")) {
            pstmt.setInt(1, serviceId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                invoice.append("Service: ").append(rs.getString("name")).append(" - INR").append(rs.getInt("rate")).append("\n");
            }

            pstmt.close();
            pstmt.setString(1, String.valueOf(additionalServiceId));
            rs = pstmt.executeQuery();
            if (rs.next()) {
                invoice.append("Additional Service: ").append(rs.getString("name")).append(" - INR").append(rs.getInt("rate")).append("\n");
            }
        }
        return invoice.toString();
    }
}