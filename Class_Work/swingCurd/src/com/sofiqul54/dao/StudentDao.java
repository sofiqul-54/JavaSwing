package com.sofiqul54.dao;

import com.sofiqul54.domain.Student;
import java.util.List;

public interface StudentDao {

    void createTable(String sql);

    void insert(Student s);

    void update(Student s);

    void delete(Student s);

    Student getByID(Student s);

    List<Student> getStudents();
}
