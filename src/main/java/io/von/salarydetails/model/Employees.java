package io.von.salarydetails.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employees {

    @Id
    @GeneratedValue
    private int empId;

    private String full_name;

    private int deptId;

    private int mgrId;

    private int salary;
}
