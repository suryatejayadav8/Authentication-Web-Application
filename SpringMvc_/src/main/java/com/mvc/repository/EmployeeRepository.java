package com.mvc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.model.Employee;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Insert
    public int save(Employee employee) {

        String sql = "INSERT INTO employee(emp_id, emp_name, department) VALUES (?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                employee.getEmpId(),
                employee.getEmpName(),
                employee.getDept());
    }

    // Update
    public int update(Employee employee) {

        String sql = "UPDATE employee SET emp_name=?, department=? WHERE emp_id=?";

        return jdbcTemplate.update(
                sql,
                employee.getEmpName(),
                employee.getDept(),
                employee.getEmpId());
    }

    // Delete
    public int delete(String empId) {

        String sql = "DELETE FROM employee WHERE emp_id=?";

        return jdbcTemplate.update(sql, empId);
    }

    // Find By Id (returns null instead of throwing when not found)
    public Employee findById(String empId) {

        String sql = "SELECT * FROM employee WHERE emp_id=?";

        List<Employee> results = jdbcTemplate.query(
                sql,
                new EmployeeRowMapper(),
                empId);

        return results.isEmpty() ? null : results.get(0);
    }

    // Check if an Employee Id already exists (used to decide Add vs Edit)
    public boolean existsById(String empId) {
        String sql = "SELECT COUNT(*) FROM employee WHERE emp_id=?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, empId);
        return count != null && count > 0;
    }

    // Find All
    public List<Employee> findAll() {

        String sql = "SELECT * FROM employee";

        return jdbcTemplate.query(
                sql,
                new EmployeeRowMapper());
    }

}