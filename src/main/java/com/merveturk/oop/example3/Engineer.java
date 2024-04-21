package com.merveturk.oop.example3;

public class Engineer extends Employee {


    @Override
    public int calculateEmployeeSalary() {
        int salary=  super.calculateEmployeeSalary();
        return salary += (salary*30)/100;
    }
}
