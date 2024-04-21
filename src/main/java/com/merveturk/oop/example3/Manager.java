package com.merveturk.oop.example3;

public class Manager extends Employee{

    private final int salaryMultiplier= 1500;

    @Override
    public int calculateEmployeeSalary() {
        return salaryMultiplier*totalWorkingYear;
    }
}
