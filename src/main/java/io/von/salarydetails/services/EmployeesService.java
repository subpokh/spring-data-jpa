package io.von.salarydetails.services;

import io.von.salarydetails.model.Employees;
import io.von.salarydetails.repositories.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {

    @Autowired
    private EmployeesRepository employeesRepository;

    public List<Employees> getAllEmployees(){
        return employeesRepository.findAll();
    }


}
