package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.model.Employee;
import com.mvc.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public int save(Employee employee) {
        return repository.save(employee);
    }

    public int update(Employee employee) {
        return repository.update(employee);
    }

    public int delete(String empId) {
        return repository.delete(empId);
    }

    public Employee findById(String empId) {
        return repository.findById(empId);
    }

    public boolean existsById(String empId) {
        return repository.existsById(empId);
    }

    public List<Employee> findAll() {
        return repository.findAll();
    }

}