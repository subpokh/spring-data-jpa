package io.von.salarydetails.controller;

import io.von.salarydetails.model.Department;
import io.von.salarydetails.model.Employees;
import io.von.salarydetails.model.Manager;
import io.von.salarydetails.services.DepartmentService;
import io.von.salarydetails.services.EmployeesService;
import io.von.salarydetails.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SalaryDetailController {

    @Autowired
    EmployeesService employeesService;
    @Autowired
    ManagerService managerService;
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/employees")
    public List<Employees> getAllEmployees(){
        return employeesService.getAllEmployees();
    }

    @GetMapping("/managers")
    public List<Manager> getAllManagers(){
        return managerService.getAllManagers();
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

}
