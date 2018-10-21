package com.sofiqul54.daoImp;

import com.sofiqul54.dao.StudentDao;
import com.sofiqul54.domain.Student;
import java.sql.Connection;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    Connection coon = DBConnection.getConnection("xe", "hr", "hr")
    
    @Override
    public void createTable(String sql) {
        
    }

    @Override
    public void insert(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getByID(Student s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
