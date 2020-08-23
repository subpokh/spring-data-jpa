package io.von.salarydetails.services;

import io.von.salarydetails.model.Manager;
import io.von.salarydetails.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> getAllManagers(){
        return managerRepository.findAll();
    }

}
