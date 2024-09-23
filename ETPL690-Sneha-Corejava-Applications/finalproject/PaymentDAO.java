package com.evergent.corejava.finalproject;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PaymentDAO {
    public void processPayment(int serviceId, int additionalServiceId, int totalAmount) throws Exception {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement pstmt = con.prepareStatement("INSERT INTO Payments (service_id, additional_service_id, total_amount, payment_date) VALUES (?, ?, ?, NOW())")) {
            pstmt.setInt(1, serviceId);
            pstmt.setInt(2, additionalServiceId);
            pstmt.setInt(3, totalAmount);
            pstmt.executeUpdate();
        }
    }
}