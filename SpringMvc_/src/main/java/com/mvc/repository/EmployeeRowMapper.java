package com.mvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet rs, int rowNum)
            throws SQLException {

        Employee employee = new Employee();

        employee.setEmpId(rs.getString("emp_id"));
        employee.setEmpName(rs.getString("emp_name"));
        employee.setDept(rs.getString("department"));


        return employee;
    }
}