package com.sample.postgress.service;

import com.sample.postgress.dao.EmployeeDaoImpl;
import com.sample.postgress.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeDaoImpl employeeDao;

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public void insertEmployee(Employee emp) {
        employeeDao.insertEmployee(emp);

    }
    @Override
    public void updateEmployee(Employee emp) {
        employeeDao.updateEmployee(emp);

    }
    @Override
    public void executeUpdateEmployee(Employee emp) {
        employeeDao.executeUpdateEmployee(emp);

    }

    @Override
    public void deleteEmployee(Employee emp) {
        employeeDao.deleteEmployee(emp);
    }
}