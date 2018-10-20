package com.sofiqul54.domain.dao.service;

import com.sofiqul54.JDBC.DBConnection;
import com.sofiqul54.domain.dao.CommonDao;
import com.sofiqul54.domain.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeService implements CommonDao {

    Connection coon = DBConnection.getConnection("xe", "hr", "hr");

    @Override
    public List<?> getList() {
        List<Employees> list = new ArrayList<>();
        try {
            PreparedStatement ps = coon.prepareStatement("select * from employees");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Employees em = new Employees();
            em.setEmployeeID(Integer.parseInt(rs.getString(1)));
            em.setFirstName(rs.getNString(2));
            list.add(em);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
