package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mvc.model.Employee;
import com.mvc.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    // GET /employees  -> list all employees
    @GetMapping
    public String findAll(Model model) {

        List<Employee> employees = service.findAll();

        model.addAttribute("employees", employees);
        model.addAttribute("totalCount", employees.size());

        return "list";
    }

    // GET /employees/new -> show blank Add form
    @GetMapping("/new")
    public String newEmployeeForm(Model model) {

        model.addAttribute("employee", new Employee());
        model.addAttribute("formTitle", "Add Employee");
        model.addAttribute("isEdit", false);

        return "form";
    }

    // GET /employees/edit/{empId} -> show pre-filled Edit form
    @GetMapping("/edit/{empId}")
    public String editEmployeeForm(@PathVariable("empId") String empId, Model model,
                                    RedirectAttributes redirectAttributes) {

        Employee employee = service.findById(empId);

        if (employee == null) {
            redirectAttributes.addFlashAttribute("errorMessage",
                    "Employee with Id '" + empId + "' not found.");
            return "redirect:/employees";
        }

        model.addAttribute("employee", employee);
        model.addAttribute("formTitle", "Edit Employee");
        model.addAttribute("isEdit", true);

        return "form";
    }

    // POST /employees/save -> handles both Add and Update
    @PostMapping("/save")
    public String save(@ModelAttribute("employee") Employee employee,
                        RedirectAttributes redirectAttributes) {

        boolean exists = service.existsById(employee.getEmpId());

        int result;
        String action;

        if (exists) {
            result = service.update(employee);
            action = "updated";
        } else {
            result = service.save(employee);
            action = "added";
        }

        if (result > 0) {
            redirectAttributes.addFlashAttribute("successMessage",
                    "Employee " + action + " successfully.");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage",
                    "Something went wrong. Employee was not " + action + ".");
        }

        return "redirect:/employees";
    }

    // GET /employees/delete/{empId} -> delete and redirect
    @GetMapping("/delete/{empId}")
    public String delete(@PathVariable("empId") String empId, RedirectAttributes redirectAttributes) {

        int result = service.delete(empId);

        if (result > 0) {
            redirectAttributes.addFlashAttribute("successMessage", "Employee deleted successfully.");
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "Employee not found or already deleted.");
        }

        return "redirect:/employees";
    }

    // GET /employees/view/{empId} -> read-only detail view
    @GetMapping("/view/{empId}")
    public String view(@PathVariable String empId, Model model,
                        RedirectAttributes redirectAttributes) {

        Employee employee = service.findById(empId);

        if (employee == null) {
            redirectAttributes.addFlashAttribute("errorMessage",
                    "Employee with Id '" + empId + "' not found.");
            return "redirect:/employees";
        }

        model.addAttribute("employee", employee);
        return "view";
    }
}
