package com.sofiqul54.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSevice {

    static Connection conn = DBConnection.getConnection("xe", "hr", "hr");

    public static void getEmployeeList() {
        // String sql = "select * from employees";
        try {
            PreparedStatement ps = conn.prepareStatement("select * from employees");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("" + rs.getNString(1) + "   " + rs.getNString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TestSevice.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }

    public static void updateEmployee() {
        try {
            PreparedStatement ps = conn.prepareStatement("update employees set first_name = 'Bangladesh' where employee_id=100");
            int i = ps.executeUpdate();
            System.out.println(i + "Updated");
        } catch (SQLException ex) {
            Logger.getLogger(TestSevice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deleteEmployee() {

        try {
            PreparedStatement ps = conn.prepareStatement("delete from employees where employee_id=100");
            int i = ps.executeUpdate();
            System.out.println(i + "Data has Deleted");
        } catch (SQLException ex) {
            Logger.getLogger(TestSevice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
