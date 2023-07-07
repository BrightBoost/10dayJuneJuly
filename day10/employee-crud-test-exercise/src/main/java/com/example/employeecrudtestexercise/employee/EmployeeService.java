package com.example.employeecrudtestexercise.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee get(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void create(Employee employee) {
        employeeRepository.save(employee);
    }

    public boolean update(Employee employee, long id) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            Employee updatedEmployee = existingEmployee.get();
            updatedEmployee.setName(employee.getName());
            updatedEmployee.setPosition(employee.getPosition());
            updatedEmployee.setSalary(employee.getSalary());
            updatedEmployee.setStartDate(employee.getStartDate());
            employeeRepository.save(updatedEmployee);
            return true;
        }
        return false;
    }

    public boolean delete(long id) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if (existingEmployee.isPresent()) {
            employeeRepository.delete(existingEmployee.get());
            return true;
        }
        return false;
    }
}
