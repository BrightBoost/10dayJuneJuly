package com.example.employeecrudtestexercise.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;
    @NonNull
    private String name;
    private String position;

    private double salary;
    private LocalDate startDate;

    public Employee() {

    }

    public Employee(long id, String name, String position, double salary, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(position, employee.position) && Objects.equals(startDate, employee.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, position, salary, startDate);
    }
}
