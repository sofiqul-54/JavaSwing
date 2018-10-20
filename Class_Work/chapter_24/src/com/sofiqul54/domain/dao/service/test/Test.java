
package com.sofiqul54.domain.dao.service.test;

import com.sofiqul54.domain.Employees;
import com.sofiqul54.domain.dao.CommonDao;
import com.sofiqul54.domain.dao.service.EmployeeService;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CommonDao emDao = new EmployeeService();
        List<Employees> list = (List<Employees>)emDao.getList();
        for(Employees e : list){
            System.out.println(e.getEmployeeID()+"  "+e.getFirstName());
        }
    }
}
